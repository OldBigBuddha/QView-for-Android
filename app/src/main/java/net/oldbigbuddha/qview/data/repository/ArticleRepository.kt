package net.oldbigbuddha.qview.data.repository

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.coroutines.awaitObjectResponseResult
import com.github.kittinunf.fuel.serialization.kotlinxDeserializerOf
import com.github.kittinunf.fuel.serialization.responseObject
import com.github.kittinunf.result.Result
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.ImplicitReflectionSerializer
import net.oldbigbuddha.qview.data.api.response.Article

class ArticleRepository() {

    init {
        FuelManager.instance.basePath = "https://qiita.com/api/v2"
        FuelManager.instance.baseHeaders = mapOf(
            "User-Agent" to "QView for Android",
            "Content-Type" to "application/json"
        )
    }

    @ImplicitReflectionSerializer
    fun getArticle(id: String): Article? {
        var article: Article? = null
        Fuel.get("/items/$id").responseObject<Article> { _, _, result ->
            when (result) {
                is Result.Failure -> {
                    throw result.getException().exception
                }

                is Result.Success -> {
                    article = result.value
                }
            }
        }
        return article
    }
}
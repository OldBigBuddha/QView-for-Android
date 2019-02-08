package net.oldbigbuddha.qview

import android.app.Application
import android.util.Log
import com.github.kittinunf.fuel.core.FuelManager

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FuelManager.instance.basePath = "https://qiita.com/api/v2"
        FuelManager.instance.baseHeaders = mapOf(
            "User-Agent" to "QView for Android",
            "Content-Type" to "application/json"
        )

        Log.d("Application", FuelManager.instance.toString())
    }
}
package net.oldbigbuddha.qview.data.api.response

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 記事につけられたここのタグの情報
 *
 * @author OldBigBuddha
 * @since alpha-1.0.0
 * ref: https://qiita.com/api/v2/docs#%E3%82%BF%E3%82%B0
 */

@Serializable
data class Tag(

    /**
     * このタグをフォローしているユーザの数
     *
     * Example: 100
     */
    @SerialName("followers_count")
    private val followersCount: Int,

    /**
     * このタグに設定されたアイコン画像のURL、Optional
     *
     * Example: "https://s3-ap-northeast-1.amazonaws.com/qiita-tag-image/9de6a11d330f5694820082438f88ccf4a1b289b2/medium.jpg"
     */
    @Optional
    @SerialName("icon_url")
    private val iconUrl: String = "",

    /**
     * タグを特定するための一意な名前
     *
     * Example: "qiita"
     */
    private val id: String,

    /**
     * このタグが付けられた記事の数
     *
     * Example: 200
     */
    @SerialName("items_count")
    private val articlesCount: Int
)
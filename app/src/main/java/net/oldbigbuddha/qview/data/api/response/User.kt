package net.oldbigbuddha.qview.data.api.response

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Qiitaのユーザ情報
 *
 * @author OldBigBuddha
 * @since alpha-1.0.0
 * ref: https://qiita.com/api/v2/docs#%E3%83%A6%E3%83%BC%E3%82%B6
 */

@Serializable
data class User(

    /**
     * 自己紹介文、Optional
     * Example: "Hello, world."
     */
    @Optional
    private val description: String = "",

    /**
     * Facebook ID、Optional
     * Example: "yaotti"
     */
    @Optional
    @SerialName("facebook_id")
    private val facebookId: String = "",

    /**
     * このユーザがフォローしているユーザの数
     * Example: 100
     */
    @SerialName("followees_count")
    private val followingsCount: Int,

    /**
     * このユーザをフォローしているユーザの数
     * Example: 200
     */
    @SerialName("followers_count")
    private val followersCount: Int,

    /**
     * GitHub ID、Optiona
     * Example: "yaotti"
     */
    @Optional
    @SerialName("github_login_name")
    private val githubId: String = "",

    /**
     * ユーザID
     * Example: "yaotti"
     */
    private val id: String,

    /**
     * このユーザが qiita.com 上で公開している記事の数 (Qiita:Teamでの記事数は含まれない)
     * Example: 300
     */
    @SerialName("items_count")
    private val articlesCount: Int,

    /**
     * LinkedIn ID
     * Example: "yaotti"
     */
    @Optional
    @SerialName("linkedin_id")
    private val linkedInId: String = "",

    /**
     * 居住地、Optional
     * Example: "Tokyo, Japan"
     */
    @Optional
    private val location: String = "",

    /**
     * 設定している名前
     * Example: "Hiroshige Umino"
     */
    private val name: String,

    /**
     * 所属している組織、Optional
     * Example: "Increments Inc"
     */
    @Optional
    private val organization: String = "",

    /**
     * ユーザごとに割り当てられる整数のID
     * Example: 1
     */
    @SerialName("permanent_id")
    private val userId: Int,

    /**
     * 設定しているプロフィール画像のURL
     * Example: "https://si0.twimg.com/profile_images/2309761038/1ijg13pfs0dg84sk2y0h_normal.jpeg"
     */
    @SerialName("profile_image_url")
    private val profileImageUrl: String,

    /**
     * Qiita:Team専用モードに設定されているかどうか
     * Example: false
     */
    @SerialName("team_only")
    private val isTeamOnly: Boolean,

    /**
     * Twitterのスクリーンネーム、Optional
     * Example: "yaotti"
     */
    @Optional
    @SerialName("twitter_screen_name")
    private val twitterScreenName: String = "",

    /**
     * 設定しているWebサイトのURL、Optional
     * Example: "http://yaotti.hatenablog.com"
     */

    @Optional
    @SerialName("website_url")
    private val websiteUrl: String = ""

)
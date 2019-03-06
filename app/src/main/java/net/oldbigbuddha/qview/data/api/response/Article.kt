package net.oldbigbuddha.qview.data.api.response

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * ユーザからの投稿情報
 *
 * @author OldBigBuddha
 * @since alpha-1.0.0
 * ref: https://qiita.com/api/v2/docs#%E6%8A%95%E7%A8%BF
 */

@Serializable
data class Article(

    /**
     * HTML形式の本文
     *
     * Example: "<h1>Example</h1>"
     */
    @SerialName("rendered_body")
    private val renderedBody: String,

    /**
     * Markdown形式の本文
     *
     * Example: "# Example"
     */
    private val body: String,

    /**
     * この記事が共同更新状態かどうか (Qiita:Teamでのみ有効)
     *
     * Example: false
     */
    @SerialName("coediting")
    private val isCoediting: Boolean,

    /**
     * この記事へのコメントの数
     *
     * Example: 100
     */
    @SerialName("comments_count")
    private val commentsCount: Int,

    /**
     * データが作成された日時
     *
     * Example: "2000-01-01T00:00:00+00:00"
     * Format: date-time
     */
    @SerialName("created_at")
    private val createdAt: String,

    /**
     * Qiita:Teamのグループ、Optional
     */
    @Optional
    private val group: Group? = null,

    /**
     * 記事の一意なID
     *
     * Example: "4bd431809afb1bb99e4f"
     * Pattern: /^[0-9a-f]{20}$/
     */
    private val id: String,

    /**
     * この記事への「いいね！」の数（Qiitaでのみ有効）、Optional
     *
     * Example: 100
     */
    @Optional
    @SerialName("likes_count")
    private val likesCount: Int? = null,

    /**
     * 限定共有状態かどうかを表すフラグ (Qiita:Teamでは無効)、Optional
     *
     * Example: false
     */
    @Optional
    @SerialName("private")
    private val isPrivate: Boolean? = null,

    /**
     * 絵文字リアクションの数（Qiita:Teamでのみ有効）、Optional
     *
     * Example: 100
     */
    @Optional
    @SerialName("reactions_count")
    private val reactionsCount: Int? = null,

    /**
     * 記事に付いたタグ一覧
     *
     * Example: [{"name"=>"Ruby", "versions"=>["0.0.1"]}]
     */
    private val tags: List<SimpleTagInfo>,

    /**
     * 記事のタイトル
     *
     * Example: "Example title"
     */
    private val title: String,

    /**
     * データが最後に更新された日時
     *
     * Example: "2000-01-01T00:00:00+00:00"
     * Format: date-time
     */
    @SerialName("updated_at")
    private val updatedAt: String,

    /**
     * 記事のURL
     *
     * Example: "https://qiita.com/yaotti/items/4bd431809afb1bb99e4f"
     */
    private val url: String,

    /**
     * Qiita上のこの記事を投稿したユーザ
     */
    private val user: User,

    /**
     * 閲覧数、Optional
     *
     * Example: 100
     */
    @Optional
    @SerialName("page_views_count")
    private val pageViewsCount: Int? = null
) {

    @Serializable
    data class SimpleTagInfo(
        /**
         * タグのID
         *
         * Example: "Qiita"
         */
        @SerialName("name")
        private val id: String,

        /**
         * よくわかってないけど絶対ある模様
         */
        private val versions: List<String>

    )
}
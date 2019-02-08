package net.oldbigbuddha.qview

/**
 * Qiitaの記事をリスト表示するために必要な情報を保持するdata class
 */

data class ArticleItem(
    /**
     * 記事のユニークID
     */
    val id: String,
    /**
     * 記事のタイトル
     */
    val title: String,
    /**
     * 記事の著者
     */
    val author: String,
    /**
     * 記事の作成日時(更新日時ではない)
     */
    val createdAt: String,
    /**
     * 「いいね」の数
     */
    val likesCount: Int,
    /**
     * 記事のURL
     */
    val url: String,
    /**
     * 投稿者のプロフィール画像URL
     */
    val profileImageUrl: String
)
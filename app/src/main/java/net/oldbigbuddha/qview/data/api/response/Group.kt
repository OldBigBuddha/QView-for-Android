package net.oldbigbuddha.qview.data.api.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Qiita:Teamのグループ情報
 *
 * @author OldBigBuddha
 * @since alpha-1.0.0
 * ref: https://qiita.com/api/v2/docs#%E3%82%B0%E3%83%AB%E3%83%BC%E3%83%97
 */

@Serializable
data class Group(

    /**
     * データが作成された日時
     *
     * Example: "2000-01-01T00:00:00+00:00"
     * Format: date-time
     */
    @SerialName("created_at")
    private val createdAt: String,

    /**
     * グループの一意なID
     *
     * Example: 1
     */
    private val id: Int,

    /**
     * グループに付けられた表示用の名
     *
     * Example: "Dev"
     */
    private val name: String,

    /**
     * 非公開グループかどうか
     *
     * Example: false
     */
    @SerialName("private")
    private val isPrivate: Boolean,

    /**
     * データが最後に更新された日時
     *
     * Example: "2000-01-01T00:00:00+00:00"
     * Format: date-time
     */
    @SerialName("updated_at")
    private val updatedAt: String,

    /**
     * グループのチーム上での一意な名前
     *
     * Example: "dev"
     */
    @SerialName("url_name")
    private val urlName: String
)
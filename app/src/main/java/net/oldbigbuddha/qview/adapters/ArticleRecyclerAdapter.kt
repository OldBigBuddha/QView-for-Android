package net.oldbigbuddha.qview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_article.view.*

import net.oldbigbuddha.qview.ArticleItem
import net.oldbigbuddha.qview.R

class ArticleRecyclerAdapter(
    private val articles: List<ArticleItem>,
    private val context: Context
) : RecyclerView.Adapter<ArticleRecyclerAdapter.ViewHolder>() {

    companion object {
        fun sampleInstance(context: Context): ArticleRecyclerAdapter {
            val items = ArrayList<ArticleItem>()
            for (i in 1..10) {
                items.add(
                    ArticleItem(
                        i.toString(),
                        context.getString(R.string.sample_article_title),
                        context.getString(R.string.sample_article_author),
                        context.getString(R.string.sample_article_past_time),
                        7630,
                        "URL",
                        "https://avatars.githubusercontent.com/u/13755428"
                    )
                )
            }
            return ArticleRecyclerAdapter(items, context)
        }
    }

    override fun getItemCount(): Int = articles.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_article, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val targetArticle = articles[position]

        holder.tvTitle.text = targetArticle.title
        holder.tvAuthor.text = targetArticle.author
        holder.tvLikesCount.text = targetArticle.likesCount.toString()
        holder.tvPastTime.text = targetArticle.createdAt

        Picasso.with(context).load(targetArticle.profileImageUrl).fit().into(holder.ivProfile)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivProfile: ImageView = view.image_user_icon
        val tvTitle: TextView = view.tv_article_title
        val tvAuthor: TextView = view.tv_article_author
        val tvPastTime: TextView = view.tv_article_past_time
        val tvLikesCount: TextView = view.tv_likes_count
    }
}
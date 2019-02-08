package net.oldbigbuddha.qview.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_new_article_list.view.*
import net.oldbigbuddha.qview.R
import net.oldbigbuddha.qview.adapters.ArticleRecyclerAdapter

class NewArticleListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_new_article_list, container, false)
        view.recycler_new_articles.layoutManager = LinearLayoutManager(activity)
        view.recycler_new_articles.adapter = ArticleRecyclerAdapter.sampleInstance(activity!!.applicationContext)
        // Inflate the layout for this fragment
        return view
    }

}

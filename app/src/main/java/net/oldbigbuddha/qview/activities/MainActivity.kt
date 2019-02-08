package net.oldbigbuddha.qview.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import net.oldbigbuddha.qview.R
import net.oldbigbuddha.qview.fragments.main.NewArticleListFragment
import net.oldbigbuddha.qview.fragments.main.ProfileFragment
import net.oldbigbuddha.qview.fragments.main.SearchArticleFragment

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_new_article -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_fragments_main, NewArticleListFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search_articles -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_fragments_main, SearchArticleFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_fragments_main, ProfileFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_fragments_main, NewArticleListFragment())
            .commit()
    }
}

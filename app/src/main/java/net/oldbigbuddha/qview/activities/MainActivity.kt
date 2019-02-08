package net.oldbigbuddha.qview.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import net.oldbigbuddha.qview.R

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_new_article -> {
                message.setText(R.string.navigation_main_new)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search_articles -> {
                message.setText(R.string.navigation_main_search)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                message.setText(R.string.navigation_main_profile)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}

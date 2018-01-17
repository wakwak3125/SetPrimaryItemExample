package com.wakwak.setprimaryitemexample.kotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.wakwak.setprimaryitemexample.R

class KtMainActivity : AppCompatActivity() {

    companion object {
        val handler = Handler(Looper.getMainLooper())
        fun start(activity: AppCompatActivity) {
            activity.startActivity(
                    Intent(activity, KtMainActivity::class.java)
            )
        }
    }

    private lateinit var adapter: KtPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kt_main)
        initPagerAdapter()
        val pager: ViewPager = findViewById(R.id.pager)
        val tab: TabLayout = findViewById(R.id.tab)

        handler.postDelayed({ adapter.itemCount = 5 }, 500)

        pager.adapter = adapter
        tab.setupWithViewPager(pager)
    }

    private fun initPagerAdapter() {
        adapter = KtPagerAdapter(supportFragmentManager)
    }
}

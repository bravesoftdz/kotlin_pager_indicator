package com.cleversofts.pagerindicator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.button
import android.R.attr.data
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.view.ViewPager
import com.cleversofts.pagerindicator.R.id.pager




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayOf("page1", "page2", "page3", "page4", "page5", "page6")

        val adapter = MyFragmentAdapter(supportFragmentManager,data)
        pager.adapter = adapter

        pageIndicatorView.count = data.size

        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                pageIndicatorView.selection = position
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })

    }
}

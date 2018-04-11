package com.cleversofts.pagerindicator

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.os.Bundle


class MyFragmentAdapter(fm: FragmentManager, var data: Array<String>): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var f = MyFragment()

        val mArgs = Bundle()
        mArgs.putString("data", data[position])
        f.arguments = mArgs

        return f
    }

    override fun getCount(): Int {
        return data.size
    }

    override fun getItemPosition(obj: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

}
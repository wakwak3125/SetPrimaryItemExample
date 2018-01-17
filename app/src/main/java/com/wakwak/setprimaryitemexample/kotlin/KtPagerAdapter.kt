package com.wakwak.setprimaryitemexample.kotlin

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup

/**
 * Created by Ryo on 2018/01/17.
 */
class KtPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    var itemCount: Int = 0
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItem(position: Int) = KtPageFragment.newInstance(position)

    override fun getCount() = itemCount

    override fun getPageTitle(position: Int) = "Kt$position"

    // Comment out this block, avoid error
    override fun setPrimaryItem(container: ViewGroup, position: Int, any: Any) {
        super.setPrimaryItem(container, position, any)
    }
}

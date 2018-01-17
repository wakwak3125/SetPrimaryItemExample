package com.wakwak.setprimaryitemexample.java;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

/**
 * Created by Ryo on 2018/01/17.
 */

public class JavaPagerAdapter extends FragmentStatePagerAdapter {

    private int itemCount = 0;

    public JavaPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return JavaPageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return itemCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Java" + position;
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
        notifyDataSetChanged();
    }
}

package com.posin.viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.posin.viewpager.fragment.ViewPagerFragment;

/**
 * FileName: ViewpagerAdapter
 * Author: Greetty
 * Time: 2018/11/27 15:45
 * Desc: TODO
 */
public class ViewpagerAdapter extends FragmentPagerAdapter {

    private String mPageTitle[] = {"外层测试页面1", "外层测试页面2", "外层测试页面3"};

    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return ViewPagerFragment.newInstance(mPageTitle[position]);
    }

    @Override
    public int getCount() {
        return mPageTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

}

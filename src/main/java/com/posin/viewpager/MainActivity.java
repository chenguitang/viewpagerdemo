package com.posin.viewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.posin.viewpager.adapter.ViewpagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    @BindView(R.id.tb_title)
    TabLayout tbTitle;
    @BindView(R.id.vp_content)
    ViewPager vpContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initEvent();
        initData();
    }

    private void initEvent() {
        tbTitle.addOnTabSelectedListener(this);
//        vpContent.addOnPageChangeListener(this);
    }


    private void initData() {
        tbTitle.addTab(tbTitle.newTab().setText("Tab测试1"));
        tbTitle.addTab(tbTitle.newTab().setText("Tab测试2"));
        tbTitle.addTab(tbTitle.newTab().setText("Tab测试3"));

        tbTitle.setupWithViewPager(vpContent);
        vpContent.setAdapter(new ViewpagerAdapter(getSupportFragmentManager()));
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

//
//    @Override
//    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//    }
//
//    @Override
//    public void onPageSelected(int position) {
//        tbTitle.
//    }
//
//    @Override
//    public void onPageScrollStateChanged(int state) {
//
//    }
}

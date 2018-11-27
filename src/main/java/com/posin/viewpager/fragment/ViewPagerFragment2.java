package com.posin.viewpager.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.posin.viewpager.R;
import com.posin.viewpager.adapter.InsideViewpagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * FileName: ViewPagerFragment
 * Author: Greetty
 * Time: 2018/11/27 15:47
 * Desc: TODO
 */
public class ViewPagerFragment2 extends Fragment {

    @BindView(R.id.vp_fragment)
    ViewPager vpFragment;


    public static ViewPagerFragment2 newInstance(String title) {
        ViewPagerFragment2 fragment = new ViewPagerFragment2();

        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_viewpager, container, false);
        ButterKnife.bind(this, view);


        vpFragment.setAdapter(new InsideViewpagerAdapter(
                getContext(), new String[]{"内层测试内容1", "内层测试内容2", "内层测试内容3"}));

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}

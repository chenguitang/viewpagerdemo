package com.posin.viewpager.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * FileName: ViewPagerFragment
 * Author: Greetty
 * Time: 2018/11/27 15:47
 * Desc: TODO
 */
public class ViewPagerFragment extends Fragment {

    private String mTitle = "外层测试页面";

    public static ViewPagerFragment newInstance(String title) {
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitle = getArguments().getString("title");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        TextView textView = new TextView(getContext());
        textView.setText(mTitle);
        textView.setTextSize(25);
        textView.setTextColor(Color.parseColor("#000000"));
        textView.setBackgroundColor(Color.parseColor("#b5e4e2"));
        textView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        textView.setLayoutParams(layoutParams);

        return textView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}

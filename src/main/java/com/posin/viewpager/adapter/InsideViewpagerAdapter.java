package com.posin.viewpager.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * FileName: InsideViewpagerAdapter
 * Author: Greetty
 * Time: 2018/11/27 17:00
 * Desc: TODO
 */
public class InsideViewpagerAdapter extends PagerAdapter {


    private Context context;
    private String[] mContent;

    public InsideViewpagerAdapter(Context context, String[] mContent) {
        this.context = context;
        this.mContent = mContent;
    }

    @Override
    public int getCount() {
        return mContent.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(context);
        textView.setText(mContent[position]);
        textView.setTextSize(20);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setBackgroundColor(Color.parseColor("#AF82DC"));
        textView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 50);
        textView.setLayoutParams(layoutParams);
        container.addView(textView);
        return textView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}

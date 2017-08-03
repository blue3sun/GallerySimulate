package com.android.lanjing.gallerysimulate;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fragment> mFragmentsList;
    private ViewPager mViewPager;
    private MyFragmentPagerAdapter mMyFragmentPagerAdapter;
    private RelativeLayout mViewPagerContainer;
    private TextView mTvChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        initListener();
    }

    private void initListener() {
        mViewPagerContainer.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return mViewPager.dispatchTouchEvent(motionEvent);
            }
        });
        mTvChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        mFragmentsList = new ArrayList<Fragment>();
        for(int i=0;i<6;i++){
            FragmentOne FragmentOne = new FragmentOne();
            mFragmentsList.add(FragmentOne);
        }
    }

    private void initView() {
        mViewPagerContainer = (RelativeLayout)findViewById(R.id.rl_view_pager_container);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mTvChange = (TextView)findViewById(R.id.tv_change);

        mViewPager.setOffscreenPageLimit(mFragmentsList.size());
        mMyFragmentPagerAdapter = new MyFragmentPagerAdapter(
                getSupportFragmentManager(), mFragmentsList);
        mViewPager.setPageMargin(100);//间距的颜色是ViewPager的背景色
        mViewPager.setAdapter(mMyFragmentPagerAdapter);


    }
}

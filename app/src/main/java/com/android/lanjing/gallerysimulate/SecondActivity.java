package com.android.lanjing.gallerysimulate;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Gallery;
import android.widget.TextView;

/**
 * Created by Bravowhale on 2016/8/15.
 */
public class SecondActivity extends AppCompatActivity {
    private Gallery mGallery;
    private MyImageAdapter mMyImageAdapter;
    private TextView mTvChange;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        initListener();
    }
    private void initListener() {
        mTvChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initView() {
        mTvChange = (TextView)findViewById(R.id.tv_change);
        mGallery = (Gallery)findViewById(R.id.gallery);
        mMyImageAdapter = new MyImageAdapter(SecondActivity.this);
        mGallery.setAdapter(mMyImageAdapter);
    }
}

package com.android.lanjing.gallerysimulate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Bravowhale on 2016/8/15.
 */
public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        ImageView ivImg = (ImageView)view.findViewById(R.id.iv_img);
        ivImg.setImageResource(R.mipmap.img1);
    }
}

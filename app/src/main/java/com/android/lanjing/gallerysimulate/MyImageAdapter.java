package com.android.lanjing.gallerysimulate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Bravowhale on 2016/8/15.
 */
public class MyImageAdapter extends BaseAdapter{
    private Context mContext;

    public MyImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view==null){
            view = LayoutInflater.from(mContext).inflate(R.layout.adapter_image,viewGroup,false);
            holder = new ViewHolder();
            holder.iv = (ImageView) view.findViewById(R.id.iv_img);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }
        holder.iv.setImageResource(R.mipmap.img1);
        return view;
    }
    public class ViewHolder{
        private ImageView iv;
    }
}


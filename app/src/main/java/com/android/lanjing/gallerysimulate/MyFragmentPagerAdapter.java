package com.android.lanjing.gallerysimulate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Bravowhale on 2016/8/15.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragmentLists;

    public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment> fragmentLists) {
        super(fm);
        this.fragmentLists = fragmentLists;
    }

    @Override
    public Fragment getItem(int position) {
        if(fragmentLists!=null&&fragmentLists.size()>0&&fragmentLists.size()>position){
            return fragmentLists.get(position);
        }else{
            return null;
        }
    }

    @Override
    public int getCount() {
        if(fragmentLists!=null){
            return fragmentLists.size();
        }else{
            return 0;
        }
    }
}

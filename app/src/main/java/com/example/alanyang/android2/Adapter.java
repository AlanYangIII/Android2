package com.example.alanyang.android2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class Adapter extends FragmentPagerAdapter {
    private List<Fragment> Fragments;
    private List<String> Titles;

    public Adapter(FragmentManager fm, List<Fragment> fragments,List<String> titles) {
        super(fm);
        Fragments = fragments;
        Titles = titles;
    }

    public CharSequence getPageTitle(int position){
        return Titles.get(position);
    }


    @Override
    public Fragment getItem(int i) {
        return Fragments.get(i);
    }

    @Override
    public int getCount() {
        return Fragments.size();
    }
}

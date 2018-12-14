package com.example.alanyang.android2;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout TabLayout;
    ViewPager ViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }


    private void initViews() {
        TabLayout = findViewById(R.id.Tab_layout);
        ViewPager = findViewById(R.id.view_pager);
        List<String> titles = new ArrayList<>();
        List<Fragment> fragmentList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            titles.add("第"+(i+1)+"个");
            FragmentX Fragment = new FragmentX();
            int[] imageIds = {R.mipmap.a, R.mipmap.b, R.mipmap.c, R.mipmap.d,R.mipmap.e,R.mipmap.f,R.mipmap.g,R.mipmap.h};
            Fragment.setData(imageIds[i%8]);
            fragmentList.add(Fragment);
        }


        FragmentPagerAdapter Adapter = new Adapter(getSupportFragmentManager(), fragmentList, titles);
        ViewPager.setAdapter(Adapter);
        TabLayout.setupWithViewPager(ViewPager);
    }

}

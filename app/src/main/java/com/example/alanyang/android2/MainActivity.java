package com.example.alanyang.android2;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout TabLayout;
    ViewPager ViewPager;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        imageView = findViewById(R.id.ic_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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

        ViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                Toast.makeText(getApplicationContext(),"这是第"+(i+1)+"个",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });

    }

}

package com.example.myapplication.onplacebid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.onprofilekarafuru.KatakuruViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class KarafuruProfile extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private KatakuruViewPagerAdapter katakuruViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karafuru_profile);

        tabLayout = findViewById(R.id.tabLayout_karafuru_profile);
        viewPager2 = findViewById(R.id.viewpager_karafuru_profile);
        katakuruViewPagerAdapter = new KatakuruViewPagerAdapter(KarafuruProfile.this);

        viewPager2.setAdapter(katakuruViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
    }
}
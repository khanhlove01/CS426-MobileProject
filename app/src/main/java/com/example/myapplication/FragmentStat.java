package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.onstatfragment.StatViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class FragmentStat extends Fragment {

    private View view;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private StatViewPagerAdapter statViewPagerAdapter;
    public FragmentStat() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_stat, container, false);
        tabLayout = view.findViewById(R.id.tabLayout_stat);
        viewPager2 = view.findViewById(R.id.viewpager_stat);

        statViewPagerAdapter = new StatViewPagerAdapter(FragmentStat.this);
        viewPager2.setAdapter(statViewPagerAdapter);

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
        return view;
    }
}
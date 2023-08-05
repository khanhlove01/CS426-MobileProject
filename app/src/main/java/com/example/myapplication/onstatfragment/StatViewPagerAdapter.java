package com.example.myapplication.onstatfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class StatViewPagerAdapter extends FragmentStateAdapter {
    public StatViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) return new RankingFragment();
        else if(position == 1) return new ActivityFragment();
        return new RankingFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

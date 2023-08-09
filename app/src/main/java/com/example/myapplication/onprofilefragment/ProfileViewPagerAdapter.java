package com.example.myapplication.onprofilefragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.onstatfragment.ActivityFragment;
import com.example.myapplication.onstatfragment.RankingFragment;

public class ProfileViewPagerAdapter extends FragmentStateAdapter {

    public ProfileViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) return new FavouriteFragment();
        else if(position == 1) return new OfferMadeFragment();
        return new FavouriteFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

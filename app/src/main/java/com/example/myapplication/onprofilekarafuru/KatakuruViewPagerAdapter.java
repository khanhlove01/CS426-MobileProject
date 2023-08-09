package com.example.myapplication.onprofilekarafuru;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.onprofilefragment.FavouriteFragment;
import com.example.myapplication.onprofilefragment.OfferMadeFragment;

public class KatakuruViewPagerAdapter extends FragmentStateAdapter {

    public KatakuruViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) return new ItemFragment();
        else if(position == 1) return new ActivityFragment();
        return new ItemFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

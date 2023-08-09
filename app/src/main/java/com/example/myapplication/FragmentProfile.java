package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.onprofilefragment.ProfileViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class FragmentProfile extends Fragment {

    private View view;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private ProfileViewPagerAdapter profileViewPagerAdapter;
    public FragmentProfile() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        tabLayout = view.findViewById(R.id.tabLayout_profile_fragment);
        viewPager2 = view.findViewById(R.id.viewpager_profile_fragment);
        profileViewPagerAdapter = new ProfileViewPagerAdapter(FragmentProfile.this);

        viewPager2.setAdapter(profileViewPagerAdapter);

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

        //icon world
        ImageView imageViewWorldIcon = view.findViewById(R.id.icon_world_profilefragment);
        imageViewWorldIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Somewhere in your fragment code
                String facebookPageUrl = "https://www.facebook.com/13laem/";
                openFacebookPage(facebookPageUrl);

            }
        });
        //icon discord

        ImageView imageViewDiscord = view.findViewById(R.id.discord_profile_fragment);
        imageViewDiscord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = "khanhtron03#7312";
                Uri uri = Uri.parse("https://discord.com/users/" + userId);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //icon insta
        ImageView imageViewInstaIcon = view.findViewById(R.id.icon_insta_profile_fragment);
        imageViewInstaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInstagram();
                /*String scheme = "http://instagram.com/_u/USER";
                String path = "https://instagram.com/tm.khanhhhhh";
                String nomPackageInfo ="com.instagram.android";
                Intent intentAiguilleur;
                try {
                    getContext().getPackageManager().getPackageInfo(nomPackageInfo, 0);
                    intentAiguilleur = new Intent(Intent.ACTION_VIEW, Uri.parse(scheme));
                } catch (Exception e) {
                    intentAiguilleur = new Intent(Intent.ACTION_VIEW, Uri.parse(path));
                }
                getContext().startActivity(intentAiguilleur);*/
            }
        });

        return view;
    }

    private void openFacebookPage(String pageUrl) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=" + pageUrl));
            startActivity(intent);
        } catch (Exception e) {
            // If the Facebook app is not installed, open the URL in a browser
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(pageUrl));
            startActivity(intent);
        }
    }
    // Inside your Activity or Fragment
    public void openInstagram() {
        // Instagram package name
        String instagramPackageName = "com.instagram.android";

        // Create an explicit intent to open Instagram
        Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage(instagramPackageName);

        if (intent != null) {
            // If Instagram app is installed, start the intent
            startActivity(intent);
        } else {
            // If Instagram app is not installed, you can open Instagram's website
            Uri uri = Uri.parse("https://www.instagram.com/");
            intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

}
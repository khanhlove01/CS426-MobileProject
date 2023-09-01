package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //clear data

        // initalize data
        if(AppController.check == 0)
        {
            AppController.addNFTTrending();
            AppController.addNFTArt();
            AppController.addNFTGaming();
            AppController.addNFTFullList();
            AppController.addNFTOfferMade();
            AppController.check = 1;
        }
        //data

        FrameLayout frameLayout_main =findViewById(R.id.framelayout_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);

        replaceFragment(new FragmentHome());
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.action_home)
                {
                    replaceFragment(new FragmentHome());
                }
                else if(item.getItemId() == R.id.action_search)
                {
                    replaceFragment(new FragmentSearch());
                }
                else if(item.getItemId() == R.id.action_stat)
                {
                    replaceFragment(new FragmentStat());
                }
                else if(item.getItemId() == R.id.action_profile)
                {
                    replaceFragment(new FragmentProfile());
                }
                return true;
            }
        });
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout_main,fragment);
        fragmentTransaction.commit();
    }
}
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.mywaitingbid.WaitingBid;
import com.example.myapplication.onhomefragment.AdapterCollections;
import com.example.myapplication.onhomefragment.ArtFragment;
import com.example.myapplication.onhomefragment.GamingFragment;
import com.example.myapplication.onhomefragment.NFTCollections;
import com.example.myapplication.onhomefragment.TrendingFragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    private View view;
    private RecyclerView rcv_trending_collections;
    private AdapterCollections adapterCollections;

    public FragmentHome() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        replaceFragment(new TrendingFragment());
        //update total ETH
        TextView textViewNumETHTotalMain = view.findViewById(R.id.num_eth_total_we_have);
        textViewNumETHTotalMain.setText(AppController.totalETHWeHave+"");
        //btn 1
        Button buttonTrending = view.findViewById(R.id.btn_trending);
        buttonTrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new TrendingFragment());
            }
        });

        //btn2
        Button buttonArt = view.findViewById(R.id.btn_art);
        buttonArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new ArtFragment());
            }
        });

        //btn3

        Button buttonGaming = view.findViewById(R.id.btn_gaming);
        buttonGaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new GamingFragment());
            }
        });

        //trending collections
        rcv_trending_collections = view.findViewById(R.id.rcv_trending_collections);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rcv_trending_collections.setLayoutManager(linearLayoutManager);

        adapterCollections = new AdapterCollections(getContext(),getListTrendingCollections());
        rcv_trending_collections.setAdapter(adapterCollections);

        // go to waiting bid
        ImageView imageViewAvatar = view.findViewById(R.id.avatar_home_fragment);
        imageViewAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WaitingBid.class);
                startActivity(intent);
            }
        });
        return view;
    }
    private List<NFTCollections> getListTrendingCollections()
    {
        List<NFTCollections> list = new ArrayList<>();

        list.add(new NFTCollections(R.drawable.profile_verified_ranking4,"Azuki Japan","Azuki Japan"));
        list.add(new NFTCollections(R.drawable.profile_verified_ranking5,"Yellow Art","Yellow Art"));
        return list;
    }
    private void replaceFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout_home_nft,fragment);
        fragmentTransaction.commit();
    }
}
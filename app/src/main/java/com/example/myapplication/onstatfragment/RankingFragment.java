package com.example.myapplication.onstatfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class RankingFragment extends Fragment {

    private View view;
    private RecyclerView rcv_rankings;
    private AdapterRankings adapterRankings;
    public RankingFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ranking, container, false);

        //rcv
        rcv_rankings = view.findViewById(R.id.rcv_rankings);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rcv_rankings.setLayoutManager(linearLayoutManager);

        adapterRankings = new AdapterRankings(getContext(),getListNFTRankings());
        rcv_rankings.setAdapter(adapterRankings);
        return view;
    }
    private List<NFTRankingInfo> getListNFTRankings()
    {
        List<NFTRankingInfo> mList = new ArrayList<>();
        mList.add(new NFTRankingInfo("01",R.drawable.profile_verified_ranking1,"Bored Ape Yacht Club"
        ,"-18,54%","4,218"));

        mList.add(new NFTRankingInfo("02",R.drawable.profile_verified_ranking2,"Bored Ape Yacht Club"
                ,"-18,54%","4,218"));

        mList.add(new NFTRankingInfo("03",R.drawable.profile_verified_ranking3,"Bored Ape Yacht Club"
                ,"-18,54%","4,218"));

        /*mList.add(new NFTRankingInfo("04",R.drawable.profile_verified_ranking4,"Bored Ape Yacht Club"
                ,"-18,54%","4,218"));

        mList.add(new NFTRankingInfo("05",R.drawable.profile_verified_ranking5,"Bored Ape Yacht Club"
                ,"-18,54%","4,218"));*/
        return mList;
    }
}
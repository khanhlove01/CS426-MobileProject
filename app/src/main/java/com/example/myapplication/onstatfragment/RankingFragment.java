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
        ,"-12,74%","2,21"));

        mList.add(new NFTRankingInfo("02",R.drawable.profile_verified_ranking2,"Cryptopunks collection"
                ,"-19,94%","1,29"));

        mList.add(new NFTRankingInfo("03",R.drawable.profile_verified_ranking3,"Meebits collection"
                ,"-18,04%","0,99"));

        mList.add(new NFTRankingInfo("04",R.drawable.profile_verified_ranking4,"Azuki Japan Arts"
                ,"-22,14%","0,84"));

        mList.add(new NFTRankingInfo("05",R.drawable.profile_verified_ranking5,"Yellow art Collection"
                ,"-18,64%","4,21"));

        mList.add(new NFTRankingInfo("06",R.drawable.round5,"Azuki Shield collection"
                ,"-25,44%","1,66"));

        mList.add(new NFTRankingInfo("07",R.drawable.round6,"Red moon collection"
                ,"-17,17%","0,32"));

        mList.add(new NFTRankingInfo("08",R.drawable.round15,"Technology Collection"
                ,"-33,02%","0,21"));

        return mList;
    }
}
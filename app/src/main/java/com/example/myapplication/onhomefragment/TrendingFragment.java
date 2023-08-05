package com.example.myapplication.onhomefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.AppController;
import com.example.myapplication.R;
public class TrendingFragment extends Fragment {

    private View view;

    private AdapterTrendingHome adapterTrendingHome;
    private RecyclerView rcv_trending;

    public TrendingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_trending, container, false);

        rcv_trending = view.findViewById(R.id.rcv_trending_fragment);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rcv_trending.setLayoutManager(linearLayoutManager);

        adapterTrendingHome = new AdapterTrendingHome(getContext(), AppController.nftHomeTrendingList);
        rcv_trending.setAdapter(adapterTrendingHome);
        return view;
    }
}
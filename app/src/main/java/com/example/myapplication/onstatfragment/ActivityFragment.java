package com.example.myapplication.onstatfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ActivityFragment extends Fragment {

    private View view;
    private AdapterActivity adapterActivity;
    private RecyclerView rcv_activity;

    public ActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_activity, container, false);

        // rcv
        rcv_activity = view.findViewById(R.id.rcv_activity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rcv_activity.setLayoutManager(linearLayoutManager);

        adapterActivity = new AdapterActivity(getContext(),getListNFTActivity());
        rcv_activity.setAdapter(adapterActivity);
        return view;
    }
    private List<NFTActivityInfo> getListNFTActivity()
    {
        List<NFTActivityInfo> list = new ArrayList<>();
        list.add(new NFTActivityInfo(R.drawable.activity_image1,"Genesis karira","Karira #5533",
                "$100,00","TMK","PDL"));
        list.add(new NFTActivityInfo(R.drawable.activity_image2,"Blue Asia horse","Horse #1965",
                "$100,00","PDL","TMK"));
        /*list.add(new NFTActivityInfo(R.drawable.img1,"Cryptopunks","Cryptopunks #5133",
                "$100,00","TMK","PDL"));
        list.add(new NFTActivityInfo(R.drawable.img4,"Ghost","Ghost #1965",
                "$100,00","PDL","TMK"));*/
        return list;
    }
}
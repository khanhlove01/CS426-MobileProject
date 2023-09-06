package com.example.myapplication.onprofilefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class FavouriteFragment extends Fragment {

    private View view;
    private AdapterFavourite adapterFavourite;
    private RecyclerView recyclerView;

    public FavouriteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_favourite, container, false);

        //rcv
        recyclerView = view.findViewById(R.id.rcv_favourite_profilefragment);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);

        //adapter
        adapterFavourite = new AdapterFavourite(getContext(),getListFavouriteList());
        recyclerView.setAdapter(adapterFavourite);
        return view;
    }

    private List<NFTFavouritedInfo> getListFavouriteList()
    {
        List<NFTFavouritedInfo> list = new ArrayList<>();

        list.add(new NFTFavouritedInfo(R.drawable.image_favourite1,"King","King #21"));
        list.add(new NFTFavouritedInfo(R.drawable.image_favourite2,"Yasuo","Yasuo #99"));
        list.add(new NFTFavouritedInfo(R.drawable.image_favourite1,"King","King #01"));
        list.add(new NFTFavouritedInfo(R.drawable.image_favourite2,"Yasuo","Yasuo #92"));
        list.add(new NFTFavouritedInfo(R.drawable.img14,"Dog","Dog #31"));
        list.add(new NFTFavouritedInfo(R.drawable.img15,"Cat","Cat #02"));
        list.add(new NFTFavouritedInfo(R.drawable.img14,"Dog","Dog #11"));
        list.add(new NFTFavouritedInfo(R.drawable.img15,"Cat","Cat #62"));

        return list;
    }
}
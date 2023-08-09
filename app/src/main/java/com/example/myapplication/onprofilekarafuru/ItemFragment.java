package com.example.myapplication.onprofilekarafuru;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.onprofilefragment.AdapterFavourite;
import com.example.myapplication.onprofilefragment.NFTFavouritedInfo;

import java.util.ArrayList;
import java.util.List;

public class ItemFragment extends Fragment {

    private View view;
    private AdapterFavourite adapterFavourite;
    private RecyclerView recyclerView;

    public ItemFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_item, container, false);

        // rcv
        recyclerView = view.findViewById(R.id.rcv_item_katafuru);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);

        // adapter
        adapterFavourite = new AdapterFavourite(getContext(),getListItemNFT());
        recyclerView.setAdapter(adapterFavourite);
        return view;
    }

    private List<NFTFavouritedInfo> getListItemNFT()
    {
        List<NFTFavouritedInfo> list = new ArrayList<>();

        list.add(new NFTFavouritedInfo(R.drawable.image_item_katafuru1,"Karafuru","Futo #399"));
        list.add(new NFTFavouritedInfo(R.drawable.image_item_karafuru2,"Karafuru","Torao #784"));

        list.add(new NFTFavouritedInfo(R.drawable.image_item_katafuru1,"Karafuru","Futo #399"));
        list.add(new NFTFavouritedInfo(R.drawable.image_item_karafuru2,"Karafuru","Torao #784"));

        return list;
    }
}
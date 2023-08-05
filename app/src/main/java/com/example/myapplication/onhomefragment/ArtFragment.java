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

public class ArtFragment extends Fragment {
    private View view;

    private AdapterArtHome adapterArtHome;
    private RecyclerView rcv_art;

    public ArtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_art, container, false);

        rcv_art = view.findViewById(R.id.rcv_art_fragment);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rcv_art.setLayoutManager(linearLayoutManager);

        adapterArtHome = new AdapterArtHome(getContext(), AppController.nftHomeArtList);
        rcv_art.setAdapter(adapterArtHome);

        return view;
    }
}
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

public class GamingFragment extends Fragment {

    private View view;
    private AdapterGamingHome adapterGamingHome;
    private RecyclerView rcv_gaming;
    public GamingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_gaming, container, false);

        rcv_gaming = view.findViewById(R.id.rcv_gaming_fragment);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rcv_gaming.setLayoutManager(linearLayoutManager);

        adapterGamingHome = new AdapterGamingHome(getContext(), AppController.nftHomeGamingList);
        rcv_gaming.setAdapter(adapterGamingHome);
        return view;
    }
}
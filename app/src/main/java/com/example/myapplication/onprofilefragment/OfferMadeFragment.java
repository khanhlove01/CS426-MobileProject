package com.example.myapplication.onprofilefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.AppController;
import com.example.myapplication.R;
public class OfferMadeFragment extends Fragment {

    private View view;
    private AdapterOfferMade adapterOfferMade;
    private RecyclerView recyclerView;

    public OfferMadeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_offer_made, container, false);

        // rcv
        recyclerView = view.findViewById(R.id.rcv_offer_made);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        adapterOfferMade = new AdapterOfferMade(getContext(), AppController.nftOfferMadeInfoList);
        recyclerView.setAdapter(adapterOfferMade);
        return view;
    }
}
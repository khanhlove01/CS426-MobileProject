package com.example.myapplication.onprofilekarafuru;

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
    private RecyclerView recyclerView;
    private  ActivityKaraAdapter activityKaraAdapter;

    public ActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_activity2, container, false);


        // rcv
        recyclerView = view.findViewById(R.id.rcv_activityKara);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        activityKaraAdapter = new ActivityKaraAdapter(getContext(),getListNFTActivityKara());
        recyclerView.setAdapter(activityKaraAdapter);
        return view;
    }

    private List<NFTActivityKaraInfo> getListNFTActivityKara()
    {
        List<NFTActivityKaraInfo> list = new ArrayList<>();

        list.add(new NFTActivityKaraInfo(R.drawable.image_activity_kara1,"Uzachi #3330","Karafuru",
                "2,48","15 Minutes ago","6.423,8","TVNOY1718",
                "Unnamed"));
        list.add(new NFTActivityKaraInfo(R.drawable.image_activity_kara2,"Torao #4345","Karafuru",
                "1,889","18 Minutes ago","5.023,8","TVNOY1718",
                "Unnamed"));
        list.add(new NFTActivityKaraInfo(R.drawable.image_activity_kara1,"Uzachi #3330","Karafuru",
                "2,48","15 Minutes ago","6.423,8","TVNOY1718",
                "Unnamed"));
        list.add(new NFTActivityKaraInfo(R.drawable.image_activity_kara2,"Torao #4345","Karafuru",
                "1,889","18 Minutes ago","5.023,8","TVNOY1718",
                "Unnamed"));

        return list;
    }
}
package com.example.myapplication.uploadingimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.AppController;
import com.example.myapplication.R;
import com.example.myapplication.onprofilefragment.AdapterOfferMade;
import com.example.myapplication.onprofilefragment.NFTOfferMadeInfo;

import java.util.ArrayList;
import java.util.List;

public class ThirdUploadingPage extends AppCompatActivity {

    private AdapterOfferMade adapterOfferMade;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_uploading_page);

        Button buttonNext = findViewById(R.id.next_third_uploading);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdUploadingPage.this, FourthUploadingPage.class);
                startActivity(intent);
            }
        });

        //rcv
        recyclerView = findViewById(R.id.rcv_complete_listing);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        adapterOfferMade = new AdapterOfferMade(this, getListNFT());
        recyclerView.setAdapter(adapterOfferMade);
    }
    private List<NFTOfferMadeInfo> getListNFT()
    {
        List<NFTOfferMadeInfo> list = new ArrayList<>();
        list.add(AppController.nftOfferMadeInfoList.get(AppController.nftOfferMadeInfoList.size()-1));
        return list;
    }
}
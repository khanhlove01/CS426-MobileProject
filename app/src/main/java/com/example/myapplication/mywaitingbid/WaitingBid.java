package com.example.myapplication.mywaitingbid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.AppController;
import com.example.myapplication.FragmentHome;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.onplacebid.BidHistoryAdapter;
import com.example.myapplication.onplacebid.NFTBidHistoryInfo;

public class WaitingBid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting_bid);

        Intent newIntent = getIntent();
        int id_img = newIntent.getIntExtra("InfoInfo1",0);
        String img_name = newIntent.getStringExtra("InfoInfo2");
        float numETH = newIntent.getFloatExtra("InfoInfo3",0F);
        String expirationDate = newIntent.getStringExtra("InfoInfo4");

        /*System.out.println(id_img);
        System.out.println(img_name);
        System.out.println(numETH);
        System.out.println(expirationDate);*/

        if(img_name != null)
        {
            AppController.nftBidHistoryInfoList.add(new NFTBidHistoryInfo(id_img,img_name,numETH+"","15 Minutes ago",
                    "$5,128.35","18% Above",expirationDate));
        }

        //rcv
        RecyclerView recyclerView = findViewById(R.id.rcv_my_waiting_bid);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        BidHistoryAdapter bidHistoryAdapter = new BidHistoryAdapter(this,AppController.nftBidHistoryInfoList);
        recyclerView.setAdapter(bidHistoryAdapter);


        ImageView imageViewHome = findViewById(R.id.image_home_waiting_bid);
        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WaitingBid.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
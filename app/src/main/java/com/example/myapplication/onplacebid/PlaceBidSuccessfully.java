package com.example.myapplication.onplacebid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.myapplication.R;
import com.example.myapplication.mywaitingbid.WaitingBid;

public class PlaceBidSuccessfully extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_bid_successfully);

        Intent newIntent = getIntent();
        int id_img = newIntent.getIntExtra("Info1",0);
        String img_name = newIntent.getStringExtra("Info2");
        float numETH = newIntent.getFloatExtra("Info3",0F);
        String expirationDate = newIntent.getStringExtra("Info4");

        /*System.out.println(id_img);
        System.out.println(img_name);
        System.out.println(numETH);
        System.out.println(expirationDate);*/

        Button button = findViewById(R.id.button_check_my_bid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceBidSuccessfully.this, WaitingBid.class);
                intent.putExtra("InfoInfo1",id_img);
                intent.putExtra("InfoInfo2",img_name);
                intent.putExtra("InfoInfo3",numETH);
                intent.putExtra("InfoInfo4",expirationDate);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(PlaceBidSuccessfully.this);
            }
        });
    }
}
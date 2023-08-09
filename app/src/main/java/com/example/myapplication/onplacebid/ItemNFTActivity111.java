package com.example.myapplication.onplacebid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class ItemNFTActivity111 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_nftactivity111);

        Intent intent = getIntent();
        int id_img = intent.getIntExtra("NFT_Image_Item_FromSearch",0);
        String img_name = intent.getStringExtra("NFT_Image_Name_FromSearch");

        ImageView imageViewNFTItem = findViewById(R.id.image_nft_item);
        imageViewNFTItem.setImageResource(id_img);
        TextView textViewNFTItemName = findViewById(R.id.nft_item_name);
        textViewNFTItemName.setText(img_name);

        // imageview created by

        ImageView imageViewNFTCreatedBy = findViewById(R.id.image_created_by);
        imageViewNFTCreatedBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ItemNFTActivity111.this, KarafuruProfile.class);
                startActivity(intent1);
            }
        });

        //imageViewNFTItem

        imageViewNFTItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ItemNFTActivity111.this,ItemNFTPreviewActivity.class);
                intent2.putExtra("NFT_Image_Item_FromActivity111",id_img);
                startActivity(intent2);
            }
        });

        // place a bid
        ImageView imageViewButtonPlaceABid = findViewById(R.id.place_a_bid_button);
        imageViewButtonPlaceABid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ItemNFTActivity111.this, BidDetailActivity.class);
                intent3.putExtra("NFT_ImageView_Item_FromActivity111",id_img);
                intent3.putExtra("NFT_TextView_Item_FromActivity111",img_name);
                startActivity(intent3);
            }
        });

    }
}
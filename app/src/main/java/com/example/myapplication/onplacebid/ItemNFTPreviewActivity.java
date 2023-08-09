package com.example.myapplication.onplacebid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;

public class ItemNFTPreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_nftpreview);

        Intent intent = getIntent();
        int id_img = intent.getIntExtra("NFT_Image_Item_FromActivity111",0);

        ImageView imageViewPreview = findViewById(R.id.image_nft_item_preview);
        imageViewPreview.setImageResource(id_img);
    }
}
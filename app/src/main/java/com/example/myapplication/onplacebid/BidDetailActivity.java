package com.example.myapplication.onplacebid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class BidDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bid_detail);


        //get intent
        Intent intent = getIntent();
        int id_img = intent.getIntExtra("NFT_ImageView_Item_FromActivity111",0);
        String img_name = intent.getStringExtra("NFT_TextView_Item_FromActivity111");

        ImageView imageViewNFTBidDetail = findViewById(R.id.nft_image_bid_detail);
        imageViewNFTBidDetail.setImageResource(id_img);

        TextView textViewNFTNameBidDetail = findViewById(R.id.nft_name_bid_detail);
        textViewNFTNameBidDetail.setText(img_name);

        // minus and add
        TextView textViewPriceETH = findViewById(R.id.bid_detail_eth_price);

        ImageView imageViewButtonMinus = findViewById(R.id.bid_detail_minus);
        ImageView imageViewButtonAdd = findViewById(R.id.bid_detail_plus);

        imageViewButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float numETH = Float.parseFloat(textViewPriceETH.getText().toString());
                textViewPriceETH.setText(numETH+0.25+"");
            }
        });

        imageViewButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float numETH = Float.parseFloat(textViewPriceETH.getText().toString());
                if(numETH > 2.75)
                {
                    textViewPriceETH.setText(numETH-0.25+"");
                }
            }
        });

        // spinnerDate
        Spinner spinnerDate = findViewById(R.id.expiration_date_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spinner_items,R.layout.spinner_dropdown_date);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_date);
        spinnerDate.setAdapter(adapter);

        //spinnerTime
        Spinner spinnerTime = findViewById(R.id.expiration_time_spinner);

        ArrayAdapter<CharSequence> adapterTime = ArrayAdapter.createFromResource(this,R.array.spinner_time,R.layout.spinner_dropdown_date);
        adapterTime.setDropDownViewResource(R.layout.spinner_dropdown_date);
        spinnerTime.setAdapter(adapterTime);

        final String[] selectedItem = {""};
        spinnerDate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItem[0] = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // button submit
        Button buttonSubmit = findViewById(R.id.button_submit_bid_history);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(BidDetailActivity.this, PlaceBidSuccessfully.class);
                newIntent.putExtra("Info1",id_img);
                newIntent.putExtra("Info2",img_name);

                float numETH1 = Float.parseFloat(textViewPriceETH.getText().toString());
                newIntent.putExtra("Info3",numETH1);

                newIntent.putExtra("Info4",selectedItem[0]);
                startActivity(newIntent);
                Animatoo.INSTANCE.animateSlideLeft(BidDetailActivity.this);
            }
        });

        //rcv

        RecyclerView recyclerView;
        BidHistoryAdapter bidHistoryAdapter;

        recyclerView = findViewById(R.id.rcv_bid_history);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Adapter
        bidHistoryAdapter = new BidHistoryAdapter(this,getListBidHistory());
        recyclerView.setAdapter(bidHistoryAdapter);
    }

    private List<NFTBidHistoryInfo> getListBidHistory()
    {
        List<NFTBidHistoryInfo> list = new ArrayList<>();

        list.add(new NFTBidHistoryInfo(R.drawable.image_bid_history1,"Curious Joe","2,08"
        ,"10 Hours ago","4,160","8% Below","3 Months"));

        list.add(new NFTBidHistoryInfo(R.drawable.img11,"Sword Sword","2,08"
                ,"23 Hours ago","4,160","8% Below","3 Months"));

        list.add(new NFTBidHistoryInfo(R.drawable.img11,"Sword Sword","2,16"
                ,"42 Hours ago","4,320","6% Below","3 Months"));

        return list;
    }
}
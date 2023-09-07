package com.example.myapplication.uploadingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.myapplication.AppController;
import com.example.myapplication.R;
import com.example.myapplication.onprofilefragment.NFTOfferMadeInfo;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class SecondUploadingPage extends AppCompatActivity {

    private Spinner spinnerCategoryBlockchain,spinnerCategoryExpirationDate,spinnerCategoryTime;
    private CategoryBlockchainAdapter categoryBlockchainAdapter,categoryExpirationDateAdapter,categoryTimeAdapter;

    private String blockchainName;
    private float numSupplyItems = 1f;
    private float numETH = 1f;
    private String expirationDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_uploading_page);

        /*ImageView imageView = findViewById(R.id.imageView_second);
        String imageUriString = getIntent().getStringExtra("imageUri");

        if (imageUriString != null) {
            Uri imageUri = Uri.parse(imageUriString);
            imageView.setImageURI(imageUri);
        }*/
        String imageUriString = getIntent().getStringExtra("imageUri");
        String imageName = getIntent().getStringExtra("imageName");

        TextInputEditText textInputEditTextSupplyItems = findViewById(R.id.num_supply_items);
        //numSupplyItems = textInputEditTextSupplyItems.getText().toString();

        textInputEditTextSupplyItems.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                numSupplyItems = Float.parseFloat(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        TextView textViewNumETHTotalEarning = findViewById(R.id.num_eth_total_earnings);
        textViewNumETHTotalEarning.setText(numETH*90/100+"");

        TextView textViewNumUSDTotalEarning = findViewById(R.id.num_usd_total_earnings);
        textViewNumUSDTotalEarning.setText("($"+numETH*0.9*2000+")");

        TextInputEditText textInputEditTextNumETH = findViewById(R.id.num_eth_set_price);
        //numETH = textInputEditTextNumETH.getText().toString();

        textInputEditTextNumETH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                numETH = Float.parseFloat(s.toString());
                textViewNumETHTotalEarning.setText(numETH*90/100+"");
                textViewNumUSDTotalEarning.setText("($"+numETH*0.9*2000+")");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        Button buttonNext = findViewById(R.id.next_second_uploading);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondUploadingPage.this, ThirdUploadingPage.class);
                AppController.nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.activity_image1,"Housing#1932",
                        numETH+"", "Now",numETH*2000+"",
                        expirationDate,imageUriString));
                intent.putExtra("imageUriFromSecondToThird", imageUriString);
                intent.putExtra("imageNameFromSecondToThird",imageName);
                intent.putExtra("numETHFromSecondToThird",numETH);
                intent.putExtra("numSupplyItemsFromSecondToThird",numSupplyItems);
                intent.putExtra("expirationDateFromSecondToThird",expirationDate);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(SecondUploadingPage.this);
            }
        });


        //spinner 1
        spinnerCategoryBlockchain = findViewById(R.id.spinner_choose_blockchain);
        categoryBlockchainAdapter = new CategoryBlockchainAdapter(this,R.layout.spinner_choose_blockchain,getListCategoryBlockchain());
        spinnerCategoryBlockchain.setAdapter(categoryBlockchainAdapter);

        spinnerCategoryBlockchain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(SecondUploadingPage.this,categoryBlockchainAdapter.getItem(position).getName(),Toast.LENGTH_SHORT).show();
                blockchainName = categoryBlockchainAdapter.getItem(position).getName();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner 2
        spinnerCategoryExpirationDate = findViewById(R.id.spinner_choose_date_in_set_price);
        categoryExpirationDateAdapter = new CategoryBlockchainAdapter(this,R.layout.spinner_choose_blockchain,getListExpirationDate());
        spinnerCategoryExpirationDate.setAdapter(categoryExpirationDateAdapter);

        spinnerCategoryExpirationDate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(SecondUploadingPage.this,categoryExpirationDateAdapter.getItem(position).getName(),Toast.LENGTH_SHORT).show();
                expirationDate = categoryExpirationDateAdapter.getItem(position).getName();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner 3
        spinnerCategoryTime = findViewById(R.id.spinner_choose_time_in_set_price);
        categoryTimeAdapter = new CategoryBlockchainAdapter(this,R.layout.spinner_choose_blockchain,getListTime());
        spinnerCategoryTime.setAdapter(categoryTimeAdapter);

        spinnerCategoryTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(SecondUploadingPage.this,categoryTimeAdapter.getItem(position).getName(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    private List<CategoryBlockchain> getListTime()
    {
        List<CategoryBlockchain> list = new ArrayList<>();
        list.add(new CategoryBlockchain("6AM"));
        list.add(new CategoryBlockchain("12PM"));
        list.add(new CategoryBlockchain("6PM"));
        return list;
    }
    private List<CategoryBlockchain> getListExpirationDate()
    {
        List<CategoryBlockchain> list = new ArrayList<>();
        list.add(new CategoryBlockchain("1 month"));
        list.add(new CategoryBlockchain("2 months"));
        list.add(new CategoryBlockchain("3 months"));
        return list;
    }
    private List<CategoryBlockchain> getListCategoryBlockchain()
    {
        List<CategoryBlockchain> list = new ArrayList<>();
        list.add(new CategoryBlockchain("Ethereum"));
        list.add(new CategoryBlockchain("Binance Smart Chain"));
        list.add(new CategoryBlockchain("Polygon"));
        return list;
    }
}
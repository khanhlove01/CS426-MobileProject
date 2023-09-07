package com.example.myapplication.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.myapplication.R;

public class OnBoarding2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding2);

        Button button = findViewById(R.id.btn_onboarding2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnBoarding2.this,OnBoarding3.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateSlideLeft(OnBoarding2.this);
            }
        });
    }
}
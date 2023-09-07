package com.example.myapplication.uploadingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class FourthUploadingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_uploading_page);

        Button buttonBackToHome = findViewById(R.id.next_fourth_uploading);
        buttonBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthUploadingPage.this, MainActivity.class);
                startActivity(intent);
                Animatoo.INSTANCE.animateZoom(FourthUploadingPage.this);
            }
        });
    }
}
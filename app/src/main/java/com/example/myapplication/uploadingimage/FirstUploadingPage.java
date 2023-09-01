package com.example.myapplication.uploadingimage;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;

// Your imports

public class FirstUploadingPage extends AppCompatActivity {

    private ActivityResultLauncher<Intent> resultLauncher;
    private ImageView imageViewInput;

    Uri imageUriUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_uploading_page);

        initializeViews();
        registerResult();

        Button buttonNext = findViewById(R.id.next_first_uploading);
        TextInputEditText textInputEditText = findViewById(R.id.name_upload_items);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstUploadingPage.this, SecondUploadingPage.class);
                intent.putExtra("imageUri", imageUriUri.toString());
                System.out.println(imageUriUri);
                intent.putExtra("imageName",textInputEditText.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void initializeViews() {
        Button button = findViewById(R.id.btn_upload);
        imageViewInput = findViewById(R.id.imageview_upload_your_nft);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });
    }

    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        resultLauncher.launch(intent);
    }

    private void registerResult() {
        resultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        try {
                            if (result.getResultCode() == RESULT_OK) {
                                Uri imageUri = result.getData().getData();
                                imageUriUri = result.getData().getData();
                                if (imageUri != null) {
                                    imageViewInput.setImageURI(imageUri);
                                } else {
                                    showToast("No image selected");
                                }
                            }
                        } catch (Exception e) {
                            showToast("Error while handling image selection");
                        }
                    }
                }
        );
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        resultLauncher.unregister(); // Unregister the callback to prevent leaks
    }
}

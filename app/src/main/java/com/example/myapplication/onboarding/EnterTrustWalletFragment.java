package com.example.myapplication.onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.R;

public class EnterTrustWalletFragment extends Fragment {

    private View view;

    public EnterTrustWalletFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_enter_trust_wallet, container, false);

        Button button = view.findViewById(R.id.btn_confirm_trustwallet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),WellcomeActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
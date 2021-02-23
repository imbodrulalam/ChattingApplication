package com.example.chattingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.chattingapplication.databinding.ActivityOTPBinding;

public class OTPActivity extends AppCompatActivity {
    ActivityOTPBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityOTPBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String phoneNumber = getIntent().getStringExtra("phoneNumber");
        binding.verifyLbl.setText("Verify " + phoneNumber);
    }
}
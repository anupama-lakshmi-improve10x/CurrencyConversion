package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.currencyconversion.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(this, CurrencyConversionActivity.class);
            startActivity(intent);
        },1500);
    }
}
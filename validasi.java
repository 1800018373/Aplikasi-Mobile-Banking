package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class validasi extends AppCompatActivity {
    public Button Lanjutkan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi);

    }

    public void berhasil(View view) {
        startActivity(new Intent(validasi.this,berhasil.class));
    }
}
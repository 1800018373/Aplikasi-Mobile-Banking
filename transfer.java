package com.example.mobilebanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class transfer extends AppCompatActivity {
    public Button BNI, antarbank, kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        BNI =(Button)findViewById(R.id.BNI);
        BNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TBNI();
                startActivity(new Intent(transfer.this, bni.class));
            }
        });

        antarbank =(Button)findViewById(R.id.antarbank);
        antarbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(transfer.this, antarbank.class));
            }
        });

        kembali =(Button)findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(transfer.this, MainActivity.class));
            }
        });
    }
    public void TBNI(){
        Toast.makeText(this,"Transfer BNI", Toast.LENGTH_SHORT).show();
    }
}
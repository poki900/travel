package com.example.travel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opis);
    }

    public void obBtnClick(View view){
        Intent intent2 = new Intent(OpisActivity.this, MenuActivity.class);
        startActivity(intent2);
    }
}
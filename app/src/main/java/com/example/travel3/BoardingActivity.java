package com.example.travel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BoardingActivity extends AppCompatActivity {

    boolean ifKod = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding);
    }

    public void obBtnClick(View view){
        Intent intent3 = new Intent(BoardingActivity.this, MenuActivity.class);
        startActivity(intent3);
    }
    public void obBtnClick2(View view){
        if(ifKod){
            ImageView iv = findViewById(R.id.imageView2);
            iv.setImageResource(R.drawable.img_2);
            Button btn = findViewById(R.id.button4);
            btn.setText("Pokaż kod");
            ifKod = false;
        }else {
            ImageView iv = findViewById(R.id.imageView2);
            iv.setImageResource(R.drawable.img_3);
            Button btn = findViewById(R.id.button4);
            btn.setText("Pokaż bilet");
            ifKod = true;
        }
    }
}
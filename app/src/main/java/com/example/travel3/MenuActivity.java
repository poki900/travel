package com.example.travel3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuActivity extends AppCompatActivity {
    private ListView list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        list = (ListView) findViewById(R.id.listView);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent2 = new Intent(MenuActivity.this, OpisActivity.class);
                    startActivity(intent2);
                } else if(position == 3){
                    Intent intent2 = new Intent(MenuActivity.this, BoardingActivity.class);
                    startActivity(intent2);
                } else if(position == 2){
                    Intent intent2 = new Intent(MenuActivity.this, ToDoActivity.class);
                    startActivity(intent2);
                }else if(position == 1){
                    Intent intent2 = new Intent(MenuActivity.this, PlanActivity.class);
                    startActivity(intent2);
                }
            }
        });
        String items[] = {"Opis", "Plan", "Lista", "Bilet","Mapa"};

        ArrayList<String> itemL = new ArrayList<String>();
        itemL.addAll(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this,R.layout.row,items);

        list.setAdapter(adapter);
    }

    public void obBtnClick(View view){
        Intent intent2 = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent2);
    }
}
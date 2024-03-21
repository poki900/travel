package com.example.travel3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class PlanActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayList<Boolean> bitems;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    private int num = 0;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        listView =  (ListView) findViewById(R.id.listViewToDo);
        btn = findViewById(R.id.button5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem(v);
            }
        });
        bitems = new ArrayList<>();
        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(itemsAdapter);
        //done();
    }


    public void obBtnClick(View view){
        Intent intent3 = new Intent(PlanActivity.this, MenuActivity.class);
        startActivity(intent3);
    }

    public void addItem(View v){
        EditText et = findViewById(R.id.editTextText);
        String itemText = et.getText().toString();
        if(!(itemText.equals(""))){
            itemsAdapter.add("Dzień "+num+": "+itemText);
            num = num + 1;
            //boolean temp = false;
            //bitems.add(temp);
            et.setText("");
        }else{
            Toast.makeText(getApplicationContext(),"Wpisz tekst",Toast.LENGTH_LONG).show();
        }
    }
}
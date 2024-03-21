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

public class ToDoActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayList<Boolean> bitems;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

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
        done();
    }

    private void done() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (bitems.get(position)) {
                    view.setBackgroundColor(getResources().getColor(android.R.color.white));
                    bitems.set(position,false);
                } else {
                    view.setBackgroundColor(getResources().getColor(R.color.blu));
                    bitems.set(position,true);
                }
                itemsAdapter.notifyDataSetChanged();
            }
        });
    }
    public void obBtnClick(View view){
        Intent intent3 = new Intent(ToDoActivity.this, MenuActivity.class);
        startActivity(intent3);
    }

    public void addItem(View v){
        EditText et = findViewById(R.id.editTextText);
        String itemText = et.getText().toString();
        if(!(itemText.equals(""))){
            itemsAdapter.add(itemText);
            boolean temp = false;
            bitems.add(temp);
            et.setText("");
        }else{
            Toast.makeText(getApplicationContext(),"Wpisz tekst",Toast.LENGTH_LONG).show();
        }
    }
}
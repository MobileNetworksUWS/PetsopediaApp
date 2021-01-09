package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Rabbits extends AppCompatActivity {

    Button backbutton;
    List<String> datas = new ArrayList<>();
    ScrollChoice rabbitScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rabbits);
        backbutton = (Button) findViewById(R.id.backRabbits);

        initViews();
        loadData();

        rabbitScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });

        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Rabbits.this, Explore.class);

                startActivity(intent);
            }
        });
    }

    private void loadData() {
        datas.add("Dutch");
        datas.add("English Lop");
        datas.add("Flemish Giant");
    }

    private void initViews() {
        rabbitScrollChoice = (ScrollChoice)findViewById(R.id.rabbitChoices);
    }

}

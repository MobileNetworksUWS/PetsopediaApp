package com.example.petsopedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Rabbits extends AppCompatActivity {

    List<String> datas = new ArrayList<>();
    ScrollChoice rabbitScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rabbits);

        initViews();
        loadData();

        rabbitScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });
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

package com.example.petsopedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Cats extends AppCompatActivity {

    List<String> datas = new ArrayList<>();
    ScrollChoice catScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cats);

        initViews();
        loadData();

        catScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });
    }

    private void loadData() {
        datas.add("Persian");
        datas.add("Bombay");
        datas.add("British Shorthair");
    }

    private void initViews() {
        catScrollChoice = (ScrollChoice)findViewById(R.id.catChoices);
    }

}

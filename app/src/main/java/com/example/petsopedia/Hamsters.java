package com.example.petsopedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Hamsters extends AppCompatActivity {

    List<String> datas = new ArrayList<>();
    ScrollChoice hamsterScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hamsters);

        initViews();
        loadData();

        hamsterScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });
    }

    private void loadData() {
        datas.add("Chinese");
        datas.add("Russian");
        datas.add("Syrian");
    }

    private void initViews() {
        hamsterScrollChoice = (ScrollChoice)findViewById(R.id.hamsterChoices);
    }

}

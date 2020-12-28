package com.example.petsopedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Birds extends AppCompatActivity {

    List<String> datas = new ArrayList<>();
    ScrollChoice birdScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birds);

        initViews();
        loadData();

        birdScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });
    }

    private void loadData() {
        datas.add("Cockatiel");
        datas.add("Parakeet");
        datas.add("Parrot");
    }

    private void initViews() {
        birdScrollChoice = (ScrollChoice)findViewById(R.id.birdChoices);
    }

}

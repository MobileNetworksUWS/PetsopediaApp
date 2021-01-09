package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Cats extends AppCompatActivity {

    Button backbutton;
    List<String> datas = new ArrayList<>();
    ScrollChoice catScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cats);
        backbutton = (Button) findViewById(R.id.backCats);

        initViews();
        loadData();

        catScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });

        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Cats.this, Explore.class);

                startActivity(intent);
            }
        });
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

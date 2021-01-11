package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Cats extends AppCompatActivity {

    ImageView backbutton;
    String[] breedArray = {"Bombay","British Shorthair","Persian"};
    final int BOMBAY = 0;
    final int SHORTHAIR = 1;
    final int PERSIAN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.cats);
        backbutton = (ImageView) findViewById(R.id.backCats);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, breedArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);


        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Cats.this, Explore.class);

                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,long arg3)
            {
                switch (position) {
                    case BOMBAY:
                        Intent bombay = new Intent(Cats.this, PetInfoBombay.class);

                        startActivity(bombay);
                        break;


                    case SHORTHAIR:
                        Intent shorthair = new Intent(Cats.this, PetInfoShorthair.class);

                        startActivity(shorthair);
                        break;

                    case PERSIAN:
                        Intent persian = new Intent(Cats.this, PetInfoPersian.class);

                        startActivity(persian);
                        break;
                }
            }
        });
    }




}

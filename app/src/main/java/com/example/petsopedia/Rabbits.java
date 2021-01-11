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

public class Rabbits extends AppCompatActivity {

    ImageView backbutton;
    String[] breedArray = {"Dutch","English Lop","Flemish Giant"};
    final int DUTCH = 0;
    final int LOP = 1;
    final int GIANT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.rabbits);
        backbutton = (ImageView) findViewById(R.id.backRabbits);


        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, breedArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Rabbits.this, Explore.class);

                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,long arg3)
            {
                switch (position) {
                    case DUTCH:
                        Intent dutch = new Intent(Rabbits.this, PetInfoDutch.class);

                        startActivity(dutch);
                        break;


                    case LOP:
                        Intent lop = new Intent(Rabbits.this, PetInfoLop.class);

                        startActivity(lop);
                        break;

                    case GIANT:
                        Intent giant = new Intent(Rabbits.this, PetInfoGiant.class);

                        startActivity(giant);
                        break;
                }
            }
        });
    }

}

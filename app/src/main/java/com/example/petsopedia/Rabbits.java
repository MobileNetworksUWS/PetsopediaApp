package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Rabbits extends AppCompatActivity {

    Button backbutton;
    String[] breedArray = {"Dutch","English Lop","Flemish Giant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rabbits);
        backbutton = (Button) findViewById(R.id.backRabbits);


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
    }

}

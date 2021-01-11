package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Dogs extends AppCompatActivity {

    Button backbutton;
    String[] breedArray = {"Alsatian","Border Collie","Labrador"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.dogs);
        backbutton = (Button) findViewById(R.id.backDogs);


        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, breedArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Dogs.this, Explore.class);

                startActivity(intent);
            }
        });

//        gobutton.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v)
//        {
//
//            switch (v) {
//                case "Alsatian":
//                    Intent intent = new Intent(Dogs.this, PetInfo.class);
//
//                    startActivity(intent);
//                    break;
//
//
//                case R.id.btn_parks:
//
//                    break;
//            }
//        }
//
//        });
    }


}

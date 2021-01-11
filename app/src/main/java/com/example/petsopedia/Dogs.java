package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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
    final int ALSATIAN = 0;
    final int COLLIE = 1;
    final int LABRADOR = 2;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,long arg3)
            {
                switch (position) {
                    case ALSATIAN:
                        Intent alsatian = new Intent(Dogs.this, PetInfoAlsatian.class);

                        startActivity(alsatian);
                        break;


                    case COLLIE:
                        Intent collie = new Intent(Dogs.this, PetInfoCollie.class);

                        startActivity(collie);
                        break;

                    case LABRADOR:
                        Intent labrador = new Intent(Dogs.this, PetInfoLabrador.class);

                        startActivity(labrador);
                        break;
                }
            }
        });

    }


}

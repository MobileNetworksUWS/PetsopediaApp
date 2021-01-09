package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Dogs extends AppCompatActivity {

    Button backbutton;
    List<String> datas = new ArrayList<>();
    ScrollChoice dogScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dogs);
        backbutton = (Button) findViewById(R.id.backDogs);

        initViews();
        loadData();

        dogScrollChoice.addItems(datas,0);

        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Dogs.this, Explore.class);

                startActivity(intent);
            }
        });
    }

    private void loadData() {
        datas.add("Alsatian");
        datas.add("Border Collie");
        datas.add("Labrador");
    }

    private void initViews() {
        dogScrollChoice = (ScrollChoice)findViewById(R.id.dogChoices);
    }

}

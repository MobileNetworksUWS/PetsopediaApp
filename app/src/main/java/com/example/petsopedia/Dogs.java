package com.example.petsopedia;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class Dogs extends AppCompatActivity {

    List<String> datas = new ArrayList<>();
    ScrollChoice dogScrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dogs);

        initViews();
        loadData();

        dogScrollChoice.addItems(datas,0);
//        dogScrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
//
//            }
//        });
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

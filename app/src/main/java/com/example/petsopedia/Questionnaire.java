package com.example.petsopedia;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire);

        Spinner typeSpinner = (Spinner) findViewById(R.id.which_spinner);
        Spinner breedSpinner = (Spinner) findViewById(R.id.breed_spinner);

// ~~~ create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> typeAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_type, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> dogBreedAdapter = ArrayAdapter.createFromResource(this,
                R.array.dog_breeds, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> catBreedAdapter = ArrayAdapter.createFromResource(this,
                R.array.cat_breeds, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> rabbitBreedAdapter = ArrayAdapter.createFromResource(this,
                R.array.rabbit_breeds, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> hamsterBreedAdapter = ArrayAdapter.createFromResource(this,
                R.array.hamster_breeds, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> birdBreedAdapter = ArrayAdapter.createFromResource(this,
                R.array.bird_breeds, android.R.layout.simple_spinner_item);

// ~~~ specify the layout to use when the list of choices appears
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dogBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        catBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rabbitBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hamsterBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        birdBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// ~~~ apply the adapter to the spinner
        typeSpinner.setAdapter(typeAdapter);

        // ~~~ delete after fixing switch statement
        breedSpinner.setAdapter(dogBreedAdapter);

// ~~~ this currently doesn't work - do not delete! leave commented out please.

//        typeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
//
//            if(typeSpinner.getSelectedItem().equals("Dogs")) {
//                breedSpinner.setAdapter(dogBreedAdapter);
//            } else if(typeSpinner.getSelectedItem().equals("Cats")) {
//                breedSpinner.setAdapter(catBreedAdapter);
//            } else if (typeSpinner.getSelectedItem().equals("Rabbits")) {
//                breedSpinner.setAdapter(rabbitBreedAdapter);
//            }
//
//            }
//
//            public void onNothingSelected(AdapterView<?> arg0) {
//
//            }
//
//        });
        }


}




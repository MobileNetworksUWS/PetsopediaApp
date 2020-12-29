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

       // String[] typeList = {"Dogs", "Rabbits","Cats"};
       String[] dogBreeds = {"Alsatian", "Border Collie","Labrador"};
       String[] catBreeds = {"Bombay", "British Shorthair","Persian"};
       String[] rabbitBreeds = {"Dutch", "English Lop","Flemish"};
       String[] hamsterBreeds = {"Chinese", "Russian","Syrian"};
       String[] birdBreeds = {"Parrot", "Parakeet","Cockatiel"};

        Spinner typeSpinner = (Spinner) findViewById(R.id.which_spinner);
        Spinner breedSpinner = (Spinner) findViewById(R.id.breed_spinner);

// ~~~ create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> typeAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_type, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> dogBreedAdapter = new ArrayAdapter<CharSequence>(this,
               android.R.layout.simple_spinner_item, dogBreeds);
        ArrayAdapter<CharSequence> catBreedAdapter = new ArrayAdapter<CharSequence>(this,
               android.R.layout.simple_spinner_item, catBreeds);
        ArrayAdapter<CharSequence> rabbitBreedAdapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_item, rabbitBreeds);
        ArrayAdapter<CharSequence> hamsterBreedAdapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_item, hamsterBreeds);
        ArrayAdapter<CharSequence> birdBreedAdapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_item, birdBreeds);

// ~~~ specify the layout to use when the list of choices appears
         typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// ~~~ apply the adapter to the spinner
        typeSpinner.setAdapter(typeAdapter);

        typeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                switch (typeSpinner.getSelectedItem().toString()) {
                    case "Dog":
                        dogBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        breedSpinner.setAdapter(dogBreedAdapter);
                        break;

                    case "Cat":
                        catBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        breedSpinner.setAdapter(catBreedAdapter);
                        break;

                    case "Rabbit":
                        rabbitBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        breedSpinner.setAdapter(rabbitBreedAdapter);
                        break;

                    case "Hamster":
                        hamsterBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        breedSpinner.setAdapter(hamsterBreedAdapter);
                        break;

                    case "Bird":
                        birdBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        breedSpinner.setAdapter(birdBreedAdapter);
                        break;

                    default:
                        breedSpinner.setEnabled(false);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        }


}




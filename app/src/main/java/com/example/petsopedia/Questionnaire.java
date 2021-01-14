package com.example.petsopedia;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Questionnaire extends AppCompatActivity {

    ImageView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.questionnaire);
        backbutton = (ImageView) findViewById(R.id.backQuestionnaire);


        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Questionnaire.this, MainActivity.class);

                startActivity(intent);
            }
        });

        String[] petTypes = {"Dog", "Cat", "Rabbit"};
        String[] dogBreeds = {"Alsatian", "Border Collie", "Labrador"};
        String[] catBreeds = {"Bombay", "British Shorthair", "Persian"};
        String[] rabbitBreeds = {"Dutch", "English Lop", "Flemish Giant"};

        Spinner typeSpinner = (Spinner) findViewById(R.id.which_spinner);
        Spinner breedSpinner = (Spinner) findViewById(R.id.breed_spinner);
        Button goButton = (Button) findViewById(R.id.goQuestionnaire);
        EditText petName  = (EditText) findViewById(R.id.petName);

// ~~~ create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> typeAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, petTypes);
        ArrayAdapter<CharSequence> dogBreedAdapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_item, dogBreeds);
        ArrayAdapter<CharSequence> catBreedAdapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_item, catBreeds);
        ArrayAdapter<CharSequence> rabbitBreedAdapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_item, rabbitBreeds);

// ~~~ specify the layout to use when the list of choices appears
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// ~~~ apply the adapter to the spinner
        typeSpinner.setAdapter(typeAdapter);

        typeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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

                    default:
                        breedSpinner.setEnabled(false);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        breedSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                switch (breedSpinner.getSelectedItem().toString()) {
                    case "Alsatian":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Alsatian" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoAlsatian.class);

                                startActivity(intent);

                            }
                        });
                        break;

                    case "Border Collie":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Border Collie" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoCollie.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "Labrador":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Labrador" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoLabrador.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "Bombay":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Bombay Cat" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoBombay.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "British Shorthair":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the British Shorthair" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoShorthair.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "Persian":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Persian Cat" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoPersian.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "Dutch":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Dutch Rabbit" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoDutch.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "English Lop":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the English Lop" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoLop.class);

                                startActivity(intent);
                            }
                        });
                        break;

                    case "Flemish Giant":
                        goButton.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v)
                            {
                                String value = petName.getText().toString();
                                Toast.makeText(Questionnaire.this, "Fetching data for " + value + " the Flemish Giant" , Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Questionnaire.this, PetInfoGiant.class);

                                startActivity(intent);
                            }
                        });
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}




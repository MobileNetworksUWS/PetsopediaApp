package com.example.petsopedia;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;


public class Questionnaire extends AppCompatActivity {

    Button pet_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire);

        Spinner ageSpinner = (Spinner) findViewById(R.id.age_spinner);
        Spinner typeSpinner = (Spinner) findViewById(R.id.which_spinner);
        Spinner breedSpinner = (Spinner) findViewById(R.id.breed_spinner);
        Spinner weightSpinner = (Spinner) findViewById(R.id.weight_spinner);
        Spinner activitySpinner = (Spinner) findViewById(R.id.activity_spinner);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> ageAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_age, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> typeAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_type, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> breedAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_breed, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> weightAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_weight, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> activityAdapter = ArrayAdapter.createFromResource(this,
                R.array.pet_activity, android.R.layout.simple_spinner_item);

// Specify the layout to use when the list of choices appears
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// ~~~ apply the adapter to the spinner
        ageSpinner.setAdapter(ageAdapter);
        typeSpinner.setAdapter(typeAdapter);
        breedSpinner.setAdapter(breedAdapter);
        weightSpinner.setAdapter(weightAdapter);
        activitySpinner.setAdapter(activityAdapter);

        // ~~~ button for moving from first page to next page

//        pet_info = (Button)findViewById(R.id.main_button);
//
//        pet_info.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v)
//            {
//
//                Intent intent = new Intent(Questionnaire.this, PetInfo.class);
//
//                startActivity(intent);
//            }
//        });

    }

}




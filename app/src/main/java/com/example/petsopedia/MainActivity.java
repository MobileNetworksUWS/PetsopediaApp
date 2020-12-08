package com.example.petsopedia;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;

    List<String> TitleList = new ArrayList<>();
    {
        TitleList.add("General Information");
        TitleList.add("Personality");
        TitleList.add("Nutrition");
        TitleList.add("Common Health Problems");
        TitleList.add("Sounds");
    }

    String[] generalInfo = {
            "Height", "Weight", "Coat", "Colour", "Lifespan"
    };
    String[] personalityInfo = {
            "This is where information about the personality of the pet goes"
    };
    String[] nutritionInfo = {
            "Nutritional information goes here"
    };
    String[] healthInfo = {
            "Health issues"
    };
    String[] soundInfo = {
            "[insert audio of pet sound here]"
    };
    String[] defaultName = {
            "Petsopedia"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : TitleList) {
            if (HoldItem.equals("General Information")) {
                loadChild(generalInfo);
            } else if (HoldItem.equals("Personality")) {
                loadChild(personalityInfo);
            } else if (HoldItem.equals("Nutrition")) {
                loadChild(nutritionInfo);
            } else if (HoldItem.equals("Common Health Problems")) {
                loadChild(healthInfo);
            } else if (HoldItem.equals("Sounds")) {
                loadChild(soundInfo);
            } else
                loadChild(defaultName);

            ParentListItems.put(HoldItem, ChildList);
        }
        expandableListView = findViewById(R.id.listview);
        final ExpandableListAdapter expandableListAdapter = new com.example.petsopedia.ListAdapter(this, TitleList, ParentListItems);
        expandableListView.setAdapter(expandableListAdapter);




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

// Apply the adapter to the spinner
        ageSpinner.setAdapter(ageAdapter);
        typeSpinner.setAdapter(typeAdapter);
        breedSpinner.setAdapter(breedAdapter);
        weightSpinner.setAdapter(weightAdapter);
        activitySpinner.setAdapter(activityAdapter);
    }

    private void loadChild(String[] ParentElementName) {

        ChildList = new ArrayList<>();
        Collections.addAll(ChildList, ParentElementName);
    }

}




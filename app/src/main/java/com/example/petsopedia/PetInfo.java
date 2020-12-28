package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PetInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet_info);

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
        final ExpandableListAdapter expandableListAdapter = new ListAdapter(this, TitleList, ParentListItems);
        expandableListView.setAdapter(expandableListAdapter);

    }

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

        private void loadChild (String[]ParentElementName){

            ChildList = new ArrayList<>();
            Collections.addAll(ChildList, ParentElementName);
        }



}

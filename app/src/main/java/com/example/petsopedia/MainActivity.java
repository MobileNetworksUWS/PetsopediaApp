package com.example.petsopedia;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button questionnaire;
    Button explore;
    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.activity_main);

        // ~~~ button for moving from first page to next page

        questionnaire = (Button)findViewById(R.id.questionnaireBtn);
        explore = (Button)findViewById(R.id.exploreBtn);
        map = (Button)findViewById(R.id.mapBtn);

        questionnaire.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(MainActivity.this, Questionnaire.class);

                startActivity(intent);
            }
        });


        explore.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(MainActivity.this, Explore.class);

                startActivity(intent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);

                startActivity(intent);
            }
        });

    }

}




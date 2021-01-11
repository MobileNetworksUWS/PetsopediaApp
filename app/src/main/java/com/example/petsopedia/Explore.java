package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Explore extends AppCompatActivity {

Button dogs;
Button cats;
Button rabbits;
ImageView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.explore);

        dogs = (Button)findViewById(R.id.dogsBtn);
        cats = (Button)findViewById(R.id.catsBtn);
        rabbits = (Button)findViewById(R.id.rabbitsBtn);
        button = (ImageView) findViewById(R.id.backExplore);

        dogs.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(Explore.this, Dogs.class);

                startActivity(intent);
            }
        });

        cats.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(Explore.this, Cats.class);

                startActivity(intent);
            }
        });

        rabbits.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(Explore.this, Rabbits.class);

                startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(android.view.View v)
            {

                Intent intent = new Intent(Explore.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
}

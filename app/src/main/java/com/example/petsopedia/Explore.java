package com.example.petsopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Explore extends AppCompatActivity {

Button dogs;
Button cats;
Button rabbits;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore);

        dogs = (Button)findViewById(R.id.dogsBtn);
        cats = (Button)findViewById(R.id.catsBtn);
        rabbits = (Button)findViewById(R.id.rabbitsBtn);
//        hamsters = (Button)findViewById(R.id.hamstersBtn);
//        birds = (Button)findViewById(R.id.birdsBtn);
        button = (Button)findViewById(R.id.backExplore);

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

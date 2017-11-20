package com.example.ivan.grancentreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GranCentre extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gran_centre);
        ImageView business = (ImageView)findViewById(R.id.buttonB);
        ImageView movies = (ImageView)findViewById(R.id.buttonM);

        business.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myIntent = new Intent(v.getContext(), Business_index.class);
                        startActivity(myIntent);
                    }
                }
        );

        movies.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myIntent = new Intent(v.getContext(), Movies.class);
                        startActivity(myIntent);
                    }
                }
        );
    }

    public void restaurants (View view){
        Intent restaurants = new Intent(GranCentre.this, restaurants_index.class);
        startActivity(restaurants);
    }

    public void weather (View view){
        Intent weather = new Intent(GranCentre.this, temps.class);
        startActivity(weather);
    }
}


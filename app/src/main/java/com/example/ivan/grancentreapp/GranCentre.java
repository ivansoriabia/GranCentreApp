package com.example.ivan.grancentreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GranCentre extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gran_centre);
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


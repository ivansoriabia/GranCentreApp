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

    protected void restaurants (View v){
        Intent restaurants = new Intent(GranCentre.this, restaurants_index.class);
        startActivity(restaurants);
    }
}


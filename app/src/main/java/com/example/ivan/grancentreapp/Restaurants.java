package com.example.ivan.grancentreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Restaurants extends AppCompatActivity {

    Spinner name_restaurants;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        name_restaurants = (Spinner) findViewById(R.id.name_restaurants);

        adapter = ArrayAdapter.createFromResource(this, R.array.restaurants_array, android.R.layout.simple_spinner_item);
    }
}

package com.example.ivan.grancentreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class restaurants_index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_index);
    }

    public void mediterrani (View view){
        Intent mediterrani = new Intent(restaurants_index.this, restaurants_mediterrani.class);
        startActivity(mediterrani);
    }

    public void italia (View view){
        Intent italia = new Intent(restaurants_index.this, restaurants_italia.class);
        startActivity(italia);
    }

    public void internacional (View view){
        Intent internacional = new Intent(restaurants_index.this, restaurants_internacional.class);
        startActivity(internacional);
    }
}

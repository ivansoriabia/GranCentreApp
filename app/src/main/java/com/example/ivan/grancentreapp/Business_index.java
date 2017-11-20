package com.example.ivan.grancentreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Business_index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_index);
        ImageView alimentacio = (ImageView)findViewById(R.id.alimentacio);
        alimentacio.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myIntent = new Intent(v.getContext(),Business_alimentacio.class);
                        startActivity(myIntent);
                    }
                }
        );
        ImageView esports = (ImageView)findViewById(R.id.esports);
        esports.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myIntent = new Intent(v.getContext(), Business_esports.class);
                        startActivity(myIntent);
                    }
                }
        );
        ImageView optica = (ImageView)findViewById(R.id.optica);
        optica.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myIntent = new Intent(v.getContext(), Business_optica.class);
                        startActivity(myIntent);
                    }
                }
        );
    }
}

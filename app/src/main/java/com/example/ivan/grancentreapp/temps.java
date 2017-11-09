package com.example.ivan.grancentreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class temps extends AppCompatActivity {

    Random r = new Random();

    int tempNum, plujaNum, ventNum;
    TextView temp, pluja, vent;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temps);

        temp = (TextView) findViewById(R.id.temp);
        tempNum = r.nextInt(41) - 5;
        temp.setText(tempNum + " ºC");

        pluja = (TextView) findViewById(R.id.pluja);
        plujaNum = r.nextInt(101);
        pluja.setText(plujaNum + " %");

        vent = (TextView) findViewById(R.id.vent);
        ventNum = r.nextInt(101);
        vent.setText(ventNum + " %");

        icon = (ImageView) findViewById(R.id.icon);
        if (plujaNum > 75) icon.setImageResource(R.drawable.rain);
        else if (ventNum > 75) icon.setImageResource(R.drawable.wind);
        else icon.setImageResource(R.drawable.sun);
    }
}

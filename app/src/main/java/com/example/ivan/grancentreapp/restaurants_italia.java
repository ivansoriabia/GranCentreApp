package com.example.ivan.grancentreapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class restaurants_italia extends AppCompatActivity{

    Button web;
    Button phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_italia);

        web = (Button) findViewById(R.id.web);

        phone = (Button) findViewById(R.id.phone);

        web.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.naguabo.cat"));
                        startActivity(intent);
                    }
                }
        );


        phone.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:938707848"));
                        startActivity(intent);
                    }
                }
        );
    }
}

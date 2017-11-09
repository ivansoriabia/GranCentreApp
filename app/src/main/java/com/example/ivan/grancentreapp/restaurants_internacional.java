package com.example.ivan.grancentreapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class restaurants_internacional extends AppCompatActivity{

    Button[] web = new Button[4];
    Button[] phone = new Button[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_internacional);

        web[0] = (Button) findViewById(R.id.web1);
        web[1] = (Button) findViewById(R.id.web2);
        web[2] = (Button) findViewById(R.id.web3);
        web[3] = (Button) findViewById(R.id.web4);

        phone[0] = (Button) findViewById(R.id.phone1);
        phone[1] = (Button) findViewById(R.id.phone2);
        phone[2] = (Button) findViewById(R.id.phone3);
        phone[3] = (Button) findViewById(R.id.phone4);

        web[0].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://enoburgersanktpauli.com/"));
                        startActivity(intent);
                    }
                }
        );

        web[1].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.naguabo.cat"));
                        startActivity(intent);
                    }
                }
        );

        web[2].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.fondaeuropa.eu"));
                        startActivity(intent);
                    }
                }
        );

        web[3].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.hotelaugustavalles.com"));
                        startActivity(intent);
                    }
                }
        );

        phone[0].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:673396470"));
                        startActivity(intent);
                    }
                }
        );

        phone[1].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:938707848"));
                        startActivity(intent);
                    }
                }
        );

        phone[2].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:938700312"));
                        startActivity(intent);
                    }
                }
        );

        phone[3].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:938456050"));
                        startActivity(intent);
                    }
                }
        );
    }
}

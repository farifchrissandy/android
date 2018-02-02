package com.ecommerce.sayurku.creative.sayurku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by MRX on 25/01/2018.
 */

public class home_layout_java extends AppCompatActivity {

    CardView mycard ;

    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.sayur);

        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),FoodList.class);
                startActivity(i);
            }
        });


        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.ikan);

        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),IkanList.class);
                startActivity(i);
            }
        });

        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.buah);
        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),BuahList.class);
                startActivity(i);
            }
        });


        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.sembako);
        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),SembakoList.class);
                startActivity(i);
            }
        });

    }
}
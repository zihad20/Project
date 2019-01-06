package com.example.asus.zihadsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.GoogleMap;

public class Home extends AppCompatActivity {

    Button nbh, sh;
    GoogleMap mMap;
    int PROXIMITY_RADIUS = 10000;
    double latitude,longitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final GetNearbyPlacesData getNearbyPlacesData = new GetNearbyPlacesData();
        nbh = findViewById(R.id.btnnbh);
        nbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}

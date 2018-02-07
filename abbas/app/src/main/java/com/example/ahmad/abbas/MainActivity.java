package com.example.ahmad.abbas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private   Button callbtn, Rescue, Controller, Condition, Verification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Rescue = (Button) findViewById(R.id.btnRescue);
        Condition  = (Button) findViewById(R.id.btnCondition);


        // Click Listeners to move next activities of android
        Rescue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Rescue1122.class);
                startActivity(intent);
            }
        });
     
        // Click Listeners to move Traffic Condition Connection Activity
        Condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(MainActivity.this, TrafficConditionConnection.class);
                startActivity(intent3);
            }

        });
    
    }

}

package com.nis.neevan.simpleservicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startServiceClick(View view) {
        //When we click on the button we should start Service

        startService(new Intent(MainActivity.this,MyService.class));

    }

    public void stopServiceClick(View view) {
        //When we click on the button we should stop Service
        stopService(new Intent(MainActivity.this,MyService.class));

    }
}

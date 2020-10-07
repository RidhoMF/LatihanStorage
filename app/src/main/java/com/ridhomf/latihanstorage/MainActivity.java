package com.ridhomf.latihanstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void internalActivity(View view) {
        Intent intent = new Intent(MainActivity.this, InternalActivity.class);
        startActivity(intent);
    }

    public void externalActivity(View view) {
        Intent intent = new Intent(MainActivity.this, ExternalActivity.class);
        startActivity(intent);
    }
}
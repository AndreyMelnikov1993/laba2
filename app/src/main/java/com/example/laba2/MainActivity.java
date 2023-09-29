package com.example.laba2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton startButton;
    private TextView helloText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = (TextView)  findViewById(R.id.helloText);
        startButton = (ImageButton) findViewById(R.id.startButton);
    }

    public void onStartButtonClick(View view) {
        startButton.setImageResource(R.drawable.android);
        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }
}
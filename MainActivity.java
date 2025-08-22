package com.example.helloandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textMessage;
    private Button btnClick;
    private Button btnReset;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textMessage = findViewById(R.id.textMessage);
        btnClick = findViewById(R.id.btnClick);
        btnReset = findViewById(R.id.btnReset);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMessage.setText("You clicked the button!");
                textMessage.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                clickCount++;  // Increment counter
                textMessage.setText("Clicked " + clickCount + " time" + (clickCount == 1 ? "" : "s") + "!");
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount = 0;
                textMessage.setText("Welcome to Android Development!");
            }
        });
    }
}

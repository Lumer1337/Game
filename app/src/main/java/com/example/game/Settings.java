package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button buttonset = (Button) findViewById(R.id.returnbutton);
        buttonset.setOnClickListener(this.ReturnButton);


        Button button1, button2;
        final RelativeLayout relativeLayout;
        button1 = findViewById(R.id.btVar1);
        button2 = findViewById(R.id.btVar2);
        relativeLayout = findViewById(R.id.rlVar1);
        // onClick function for button 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                relativeLayout.setBackgroundResource(R.color.cool);
            }
        });
        // onClick function for button 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set the color to relative layout
                relativeLayout.setBackgroundResource(R.color.warm);
            }
        });
    }
    View.OnClickListener ReturnButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.returnbutton:
                    Intent i = new Intent(Settings.this, MainActivity.class);
                    startActivity(i);
                    break;
                default:
                    break;
            }
        }
    };








}


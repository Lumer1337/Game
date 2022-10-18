package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button buttonset = (Button) findViewById(R.id.returnbutton);
        buttonset.setOnClickListener(this.ReturnButton);


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


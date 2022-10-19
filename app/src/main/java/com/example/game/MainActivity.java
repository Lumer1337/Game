package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonset = (Button) findViewById(R.id.ButtonSetings);
        buttonset.setOnClickListener(this.SetButton);

        Button buttongame = (Button) findViewById(R.id.ButtonStart);
        buttongame.setOnClickListener(this.StarButton);

        Button buttonexit = (Button) findViewById(R.id.Buttonexit);
        buttonexit.setOnClickListener(this.ExitButton);


       /*RelativeLayout ll = (RelativeLayout) findViewById(R.id.Phon);
        ll.setBackgroundColor(getRelativeLayout());*/

    }






    View.OnClickListener ExitButton = new View.OnClickListener(){
        @Override
        public void onClick(View view){  System.exit(0);
        }

    };


    View.OnClickListener StarButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ButtonStart:
                    Intent i = new Intent(MainActivity.this, Game.class);
                    startActivity(i);
                    break;
                default:
                    break;
            }
        }
    };

    View.OnClickListener SetButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ButtonSetings:
                    Intent i = new Intent(MainActivity.this, Settings.class);
                    startActivity(i);
                    break;
                default:
                    break;
            }
        }
    };


}
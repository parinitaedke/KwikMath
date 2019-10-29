package com.example.mathgame;

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

    public void openInstructionsPage(View view){
        Intent i = new Intent(this, Instructions_page.class);
        startActivity(i);
    }

    public void openGamePage(View view){
        Intent i = new Intent(this, Game_page.class);
        startActivity(i);
    }

}

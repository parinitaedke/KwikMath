package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Instructions_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions_page);
    }

    public void openMainPage(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openGamePage(View view){
        Intent i = new Intent(this, Game_page.class);
        startActivity(i);
    }
}

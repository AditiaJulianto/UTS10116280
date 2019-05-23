package com.julian.uts10116280;


/**
 * Nim : 10116280
 * Nama : Aditia Julianto
 * Kelas : AKB-7
 * TGL : 23/05/2019
 */

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        goToMain();
    }
    protected void goToMain(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(splash_screen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        };
        int time = 3000;
        new Handler().postDelayed(r, time);
    }
}

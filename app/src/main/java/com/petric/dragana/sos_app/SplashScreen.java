package com.petric.dragana.sos_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                    // an intent that starts the MainActivity
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
            }
        }, SPLASH_DISPLAY_LENGHT);

     /*   Thread mThread = new Thread() {
            @Override
            public void run() {
               try {
                   sleep(2000);
                   Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                   startActivity(intent);
                   finish();
               }catch (InterruptedException e){
                   e.printStackTrace();
               }

            }
        };*/
       // mThread.start();
    }
}

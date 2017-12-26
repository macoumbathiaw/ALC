package com.example.mthiaw.alc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        //Use the TextView to find the Splash Screen text ID
        ImageView splashScreenImageView = findViewById(R.id.splashScreenImageViewID);

        //Create an animation object and give it the text view above to animate
        Animation animationSpalshScreenImageView = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_screen_animation);
       splashScreenImageView.startAnimation(animationSpalshScreenImageView);

       //Now that we have the animation, we need to set a time for it which is the below
        Thread animationTimer = new Thread(){
            @Override
            public void run() {

                //Surrounding our code with try catch to catch exceptions
                try {

                    //The time for the splash screen to show up is
                    sleep(5000);

                    //Create an intent to open the MainActivity after the splash screen is done
                    Intent sendIntentToMainActivity = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(sendIntentToMainActivity);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finally {

                    //Here we need to finish the intent and stay in the MainActivity screen
                    finish();
                }


            }
        };

        //Here we start the animation
        animationTimer.start();
    }
}


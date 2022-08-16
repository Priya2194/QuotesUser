package com.example.quotesuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class WelcomeActivity extends AppCompatActivity {


    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        lottieAnimationView=findViewById(R.id.lottie);

        Thread thread=new Thread()
        {
            @Override
            public void run()
            {
                try {


                    sleep(4000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {


                    Intent intent=new Intent(WelcomeActivity.this,HomeActivity.class);
                    startActivity(intent);
                }

            }
        };thread.start();
    }
}
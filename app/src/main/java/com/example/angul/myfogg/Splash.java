package com.example.angul.myfogg;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = (TextView)findViewById(R.id.txttitulo);
        imageView = (ImageView) findViewById(R.id.imageView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        textView.setTypeface(typeface);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.up);

        rotate.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(rotate);
        openApp(true);
    }

    private void openApp(boolean locationPermision) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}

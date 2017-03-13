package com.example.myapp.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade (View view){
        ImageView Aladdin= (ImageView) findViewById(R.id.Aladdin);

        ImageView cnd= (ImageView) findViewById(R.id.cnd);
        cnd.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(1000)
                .setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView cnd = (ImageView) findViewById(R.id.cnd);
        cnd.setTranslationX(-1000f);
        cnd.setTranslationY(-1000f);

    }
}

package com.example.duongtainhan555.animationscale;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Init();
        EventClick();
    }
    private void Init()
    {
        imgScale = findViewById(R.id.imgScale);
    }

    private void EventClick()
    {
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        imgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
    }
}

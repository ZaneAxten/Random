package com.zaneaxten.sleepcastrandom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
private Button bopen;

    ImageView imageView;

    Button button;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bopen = (Button) findViewById(R.id.button_open);
        bopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.getsomeheadspace.android");
                startActivity(i);
            }
        });


        imageView = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.button);

        r = new Random();

        final Integer[] images = {
                R.drawable.male_1,
                R.drawable.male_2,
                R.drawable.male_3,
                R.drawable.male_4,
                R.drawable.male_5,
                R.drawable.male_6,
                R.drawable.male_7,
                R.drawable.male_8,
                R.drawable.male_9,
                R.drawable.male_10,
                R.drawable.male_11,
                R.drawable.male_12,
                R.drawable.male_13,
                R.drawable.male_14,
                R.drawable.male_15,
                R.drawable.female_12,
                R.drawable.female_2,
                R.drawable.female_3,
                R.drawable.female_4,
                R.drawable.female_5,
                R.drawable.female_6,
                R.drawable.female_7,
                R.drawable.female_8,
                R.drawable.female_9,
                R.drawable.female_10,
                R.drawable.female_11,
                R.drawable.female_12,
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(images[r.nextInt(images.length)]);

            }
        });

    }

}
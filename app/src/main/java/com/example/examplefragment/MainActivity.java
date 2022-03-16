package com.example.examplefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnred = findViewById(R.id.rbtn);
        Button btng = findViewById(R.id.gbtn);
        Button btnb = findViewById(R.id.bbtn);

        FragmentManager fm =getSupportFragmentManager();

        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction tf=fm.beginTransaction();
                tf.replace(R.id.Fragm,new RdgFragment()).commit();
            }
        });
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction tf=fm.beginTransaction();
                tf.replace(R.id.Fragm,new GreenFragment()).commit();
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction tf=fm.beginTransaction();
                tf.replace(R.id.Fragm,new BlueFragment()).commit();
            }
        });

    }
}
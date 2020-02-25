package com.nrc7.desafiolifecycle.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nrc7.desafiolifecycle.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment(), "fragment")
                .commit();
    }
}

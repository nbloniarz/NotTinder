package com.example.natalie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SwipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
    }

    public void loadProfileScreen(View view) {
        System.out.println("CALLED ON CLICK");
        startActivity(new Intent(SwipeActivity.this, ProfileActivity.class));
    }
}

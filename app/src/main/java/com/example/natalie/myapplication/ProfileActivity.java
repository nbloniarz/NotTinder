package com.example.natalie.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_profile);

    }

    public void loadSwipeScreen(View view) {
        System.out.println("CALLED ON CLICK");
        startActivity(new Intent(ProfileActivity.this, SwipeActivity.class));
    }


    public void Logout(View view){
        startActivity(new Intent(ProfileActivity.this, MainActivity.class));

    }

}

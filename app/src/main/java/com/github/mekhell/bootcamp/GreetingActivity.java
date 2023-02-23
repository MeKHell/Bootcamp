package com.github.mekhell.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName");
        setContentView(R.layout.activity_greeting);
        final TextView greeting = (TextView) findViewById(R.id.greetingText);
        greeting.setText("Hello " + nickName + "!");
    }
}
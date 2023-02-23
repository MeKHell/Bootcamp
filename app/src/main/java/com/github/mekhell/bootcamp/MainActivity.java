package com.github.mekhell.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validateNickname(View button) {
        EditText startName = (EditText) findViewById(R.id.startName);
        Intent loadNextActivity = new Intent(MainActivity.this, GreetingActivity.class);
        loadNextActivity.putExtra("nickName", startName.getText().toString());
        MainActivity.this.startActivity(loadNextActivity);
    }
}
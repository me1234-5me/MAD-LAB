package com.example.sjcet.a1_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
    }

    public void click(View view) {
        OpenNewActivity();
    }
    public void OpenNewActivity()
    {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}

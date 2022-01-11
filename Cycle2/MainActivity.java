package com.example.sjcet.twoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        Opennewactivity();
        }
    public void Opennewactivity()
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}

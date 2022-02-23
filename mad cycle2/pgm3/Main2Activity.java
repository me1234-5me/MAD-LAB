package com.example.sjcet.a3_pass_msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rcv=findViewById(R.id.rcv);
        Intent intent=getIntent();
        String str = intent.getStringExtra("Message_Key");
        rcv.setText(str);
    }
}

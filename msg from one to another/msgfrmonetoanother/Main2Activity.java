package com.example.sjcet.msgfrmonetoanother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView  receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        receiver_msg=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message_key");
        receiver_msg.setText(str);
    }
}
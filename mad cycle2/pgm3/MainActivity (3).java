package com.example.sjcet.a3_pass_msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView msg;
    Button snd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=findViewById(R.id.msg);
        snd=findViewById(R.id.snd);
    }

    public void click(View view) {
        String str = msg.getText().toString();
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("Message_Key",str);
        startActivity(intent);
    }
}

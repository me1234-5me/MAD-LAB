package com.example.sjcet.optionmenu;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.recvdinpt);
        String msg=getIntent().getStringExtra("mykey");// receiving the data
        tv.setText(msg);                                   // display(welcom changing to admin)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);    //connecting menu



        return true;                    // changing to true
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.emergency:   // full colon
                Toast.makeText(this," Emergency clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                Toast.makeText(this," Profile clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutus:
                Toast.makeText(this," About us clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.signout:
                Toast.makeText(this," Signout clicked",Toast.LENGTH_SHORT).show();
                break;


        }
        return true;// changing to true
    }
}
package com.example.sjcet.contextmenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.sjcet.contextmenu.R.menu.context_menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_view);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(context_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Emergency:
                Toast.makeText(this, "Emergency Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutus:
                Toast.makeText(this, "About Us Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.signout:
                Toast.makeText(this, "Signout Clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return super.onContextItemSelected(item);
    }
}

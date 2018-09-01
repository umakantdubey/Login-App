package com.example.umakantdubey.w3lessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void loginuser(View v)
    {
        Toast.makeText(MainActivity.this, "register success", Toast.LENGTH_LONG).show();
   }
}


package com.example.project_hloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickfn(View view)
    {
        Toast.makeText(MainActivity.this, "You just clicked me!", Toast.LENGTH_SHORT).show();
    }
}
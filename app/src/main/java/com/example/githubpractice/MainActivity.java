package com.example.githubpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void brtx(View view){
        TextView brtx = findViewById(R.id.bruhText);
        brtx.setVisibility(view.VISIBLE);







    }
}
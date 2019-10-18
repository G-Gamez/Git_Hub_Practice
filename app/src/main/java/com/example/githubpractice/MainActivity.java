package com.example.githubpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gamezButtonPress (View view){
        TextView textView = findViewById(R.id.centerText);
        final String[] githubUsers = {"Edwin", "Logan", "Kevin", "Gamez"};
        Random random = new Random();
        int index = random.nextInt(githubUsers.length);
        textView.setText(githubUsers[index]);


    }
}

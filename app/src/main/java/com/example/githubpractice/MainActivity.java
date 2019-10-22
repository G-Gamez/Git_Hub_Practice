package com.example.githubpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.clickMeButton);

    }

    public void clickMePress (View view){
        TextView textView = findViewById(R.id.textViewHello);

        EditText namedEditText = findViewById(R.id.editText);

        textView.setText("Hello " + namedEditText.getText().toString());
    }
}

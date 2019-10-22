package com.example.githubpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;




import java.util.Random;


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

    public void gamezButtonPress (View view){
        TextView textView = findViewById(R.id.centerText);
        final String[] githubUsers = {"Edwin", "Logan", "Kevin", "Gamez"};
        Random random = new Random();
        int index = random.nextInt(githubUsers.length);
        textView.setText(githubUsers[index]);
    }



    public void textSwitch (View view){
        TextView t1 = findViewById(R.id.E_TextView1);
        Button b1 = findViewById(R.id.E_button);
        EditText E1 = findViewById(R.id.E_entry);

        t1.setText(E1.getText().toString());
    }
}

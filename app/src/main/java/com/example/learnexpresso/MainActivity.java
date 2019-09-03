package com.example.learnexpresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputText;
    Button buttonChange;
    Button buttonSwitch;
    TextView textPrint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Learn Expresso");
        inputText= findViewById(R.id.inpu_text);
        buttonChange= findViewById(R.id.button_chenge);
        buttonSwitch= findViewById(R.id.button_switch);
        textPrint= findViewById(R.id.text_printed_text);
        buttonChange.setOnClickListener(this);
        buttonSwitch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_chenge:
                String input= inputText.getText().toString().trim();
                textPrint.setText(input);
                break;
            case R.id.button_switch:
                String text= inputText.getText().toString().trim();
                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("extra_input",text);
                startActivity(intent);
                break;
        }
    }
}

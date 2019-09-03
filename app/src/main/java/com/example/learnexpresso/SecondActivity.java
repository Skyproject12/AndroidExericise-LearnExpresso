package com.example.learnexpresso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String EXTRA_INPUT= "extra_input";
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Activity Second");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textResult= findViewById(R.id.text_result);
        String input= getIntent().getStringExtra(EXTRA_INPUT);
        textResult.setText(input);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // make onclick in back
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

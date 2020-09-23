package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txMain = findViewById(R.id.textToModify);
    }

    public void onClickTextChng(View view) {
        this.txMain.setText("New word");
    }

    public void onClickColorChng(View view) {
        this.txMain.setTextColor(Color.RED);
    }
}
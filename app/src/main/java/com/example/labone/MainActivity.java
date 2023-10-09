 package com.example.labone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;


import org.w3c.dom.Text;


 public class MainActivity extends AppCompatActivity {

    TextView textMain;
    Button buttonChangeText;
    Button buttonChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textMain = findViewById(R.id.textMain);
        this.buttonChangeText = findViewById(R.id.buttonChangeText);
        this.buttonChangeColor = findViewById(R.id.buttonChangeColor);
        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Some message", Toast.LENGTH_LONG).show();
            }

        });
        buttonChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMain.setTextColor(Color.RED);
            }
        });
    }

    public void onButtonChangeTextClick(View view) {
        this.textMain.setText("Kodel?");
    }
}
 package com.example.labone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


 public class MainActivity extends AppCompatActivity {

    TextView textMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textMain = findViewById(R.id.textMain);
    }

    public void onButtonChangeTextClick(View view) {
        this.textMain.setText("Kodel?");
    }
}
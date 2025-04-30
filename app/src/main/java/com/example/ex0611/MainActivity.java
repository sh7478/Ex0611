package com.example.ex0611;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch autoOrManual;
    RadioButton rBRed, rBGreen, rBBlue, rBYellow;
    LinearLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoOrManual = findViewById(R.id.autoOrManual);
        rBRed = findViewById(R.id.rBRed);
        rBGreen = findViewById(R.id.rBGreen);
        rBBlue = findViewById(R.id.rBBlue);
        rBYellow = findViewById(R.id.rBYellow);
        main = findViewById(R.id.main);
    }

    public void setBgColor(View view)
    {
        if(!autoOrManual.isChecked())
        {
            whatColor();
        }
    }

    public void manualChange(View view)
    {
        whatColor();
    }

    public void whatColor()
    {
        if(rBRed.isChecked())
        {
            main.setBackgroundColor(Color.RED);
        }
        else if(rBGreen.isChecked())
        {
            main.setBackgroundColor(Color.GREEN);
        }
        else if(rBBlue.isChecked())
        {
            main.setBackgroundColor(Color.BLUE);
        }
        else
        {
            main.setBackgroundColor(Color.YELLOW);
        }
    }
}
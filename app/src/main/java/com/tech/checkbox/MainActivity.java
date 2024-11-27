package com.tech.checkbox;

import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CheckBox redCheckBox;
    private CheckBox blueCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redCheckBox = findViewById(R.id.cBRed);
        redCheckBox = findViewById(R.id.cBRed);
        Boolean redCheckBoxState = redCheckBox.isChecked();
        Boolean blueCheckBoxState = redCheckBox.isChecked();

    }
}
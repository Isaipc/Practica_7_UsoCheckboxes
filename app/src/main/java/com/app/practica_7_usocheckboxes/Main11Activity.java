package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        RadioGroup container = findViewById(R.id.radio_group);
        RadioButton option_02 = (RadioButton) container.getChildAt(2);
        container.check(option_02.getId());
    }
}

package com.app.practica_7_usocheckboxes;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


public class Main13Activity extends AppCompatActivity {

    private static String[] MARCAS = {
            "Mazda",
            "Mercedes Benz",
            "Audi",
            "Chevrolet"
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        RadioGroup radios_section = findViewById(R.id.radio_section);

        for (String marca: MARCAS)
        {
            RadioButton radio = new RadioButton(this);
            radio.setText(marca);
            radio.setLayoutParams(new RadioGroup.LayoutParams(
                    RadioGroup.LayoutParams.WRAP_CONTENT,
                    RadioGroup.LayoutParams.WRAP_CONTENT));
            radio.setTextSize(20);
            radios_section.addView(radio);
        }
    }
}

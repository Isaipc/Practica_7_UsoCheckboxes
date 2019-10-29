package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void comprobarModoPago(View view)
    {
        RadioButton radio_1 = findViewById(R.id.radio_1);
        if (radio_1.isChecked()){
            final String text = "Comprobar ubicación del usuario";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
    }
}

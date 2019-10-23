package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        findViewById(R.id.check_1).setEnabled(false);
        findViewById(R.id.check_2).setEnabled(false);
    }

    public void actualizarCuenta(View view)
    {
        findViewById(R.id.check_1).setEnabled(true);
        findViewById(R.id.check_2).setEnabled(true);
    }
}

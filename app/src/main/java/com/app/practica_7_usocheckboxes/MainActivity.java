package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_dir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk_dir = findViewById(R.id.chk_dir_envio);
    }

    public void loguearCheckBox(View v)
    {
        String s = "estado : " + (chk_dir.isChecked() ? "Marcado" : "No marcado");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}

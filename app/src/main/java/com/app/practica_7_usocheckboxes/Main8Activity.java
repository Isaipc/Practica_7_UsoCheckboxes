package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.MeasureUnit;
import android.icu.util.UniversalTimeScale;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Main8Activity extends AppCompatActivity {
    public static String[] INDUSTRIAS = {
            "Desarrollo de Software",
            "Computación",
            "Inteligencia Artificial",
            "Tecnologías de información",
            "Base de Datos",
            "Aplicaciones Moviles",
            "Nanotecnologia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        LinearLayout checks_section = findViewById(R.id.checks_section);

        for (String industria : INDUSTRIAS)
        {
            CheckBox check = new CheckBox(this);
            check.setText(industria);
            check.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            check.setTextSize(20);
            checks_section.addView(check);
        }
    }
}

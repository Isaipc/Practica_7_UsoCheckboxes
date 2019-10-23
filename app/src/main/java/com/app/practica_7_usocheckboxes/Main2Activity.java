package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private CheckBox opcionAsegurar;
    private EditText campoMontoGiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        opcionAsegurar = findViewById(R.id.check_seguro);
        campoMontoGiro = findViewById(R.id.et_monto);

        campoMontoGiro.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = s.toString();
                if(str.isEmpty())
                    str = "0";

                float monto = Float.parseFloat(str);

                if(monto>= 1000)
                    opcionAsegurar.setChecked(true);
            }
        });
    }
}

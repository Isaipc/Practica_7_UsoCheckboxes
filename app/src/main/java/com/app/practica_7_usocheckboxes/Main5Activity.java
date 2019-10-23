package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        CheckBox check_pass = findViewById(R.id.check_pass);
        check_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarPass(v);
            }
        });
    }

    public void mostrarPass(View view)
    {
        EditText et_pass = findViewById(R.id.et_pass);
        CheckBox checkBox = (CheckBox) view;

        int i = et_pass.getSelectionEnd();
        if(checkBox.isChecked())
            et_pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        else
            et_pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        et_pass.requestFocus();
        et_pass.setSelection(i);
    }
}

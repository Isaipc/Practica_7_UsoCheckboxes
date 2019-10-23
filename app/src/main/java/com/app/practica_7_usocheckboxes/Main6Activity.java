package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Main6Activity extends AppCompatActivity
    implements CompoundButton.OnCheckedChangeListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ((CheckBox)findViewById(R.id.check_tv)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.check_radio)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.check_periodico)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.check_amigo)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.check_otros)).setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId())
        {
            case R.id.check_tv:
                findViewById(R.id.et_tv)
                        .setVisibility((isChecked ? View.VISIBLE: View.GONE));
                break;
            case R.id.check_radio:
                findViewById(R.id.et_radio)
                        .setVisibility((isChecked ? View.VISIBLE: View.GONE));
                break;
            case R.id.check_periodico:
                findViewById(R.id.et_periodico)
                        .setVisibility((isChecked ? View.VISIBLE: View.GONE));
                break;
            case R.id.check_amigo:
                findViewById(R.id.et_amigo)
                        .setVisibility((isChecked ? View.VISIBLE: View.GONE));
                break;
            case R.id.check_otros:
                findViewById(R.id.et_otros)
                        .setVisibility((isChecked ? View.VISIBLE: View.GONE));
                break;
        }

    }
}

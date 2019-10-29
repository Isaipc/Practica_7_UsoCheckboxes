package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class Main12Activity extends AppCompatActivity implements View.OnClickListener {

    private View client_container;
    private View particular_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        particular_container = findViewById(R.id.particular_container);
        client_container = findViewById(R.id.client_container);

        RadioButton radio_corporativo = findViewById(R.id.radio_corportivo);
        RadioButton radio_particular = findViewById(R.id.radio_particular);

        radio_corporativo.setOnClickListener(this);
        radio_particular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        RadioButton radio = (RadioButton) v;
        if(radio.getId() == R.id.radio_corportivo && radio.isChecked())
            switchContainer(true);
        else if(radio.getId() == R.id.radio_particular && radio.isChecked())
            switchContainer(false);
    }

    public void switchContainer(boolean isParticularChecked)
    {
        particular_container.setVisibility(isParticularChecked ? View.VISIBLE: View.GONE);
        client_container.setVisibility(isParticularChecked ? View.GONE: View.VISIBLE);
    }
}

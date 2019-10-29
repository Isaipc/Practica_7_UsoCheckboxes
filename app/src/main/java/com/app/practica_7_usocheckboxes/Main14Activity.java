package com.app.practica_7_usocheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main14Activity extends AppCompatActivity {

    private SQLiteController sqLiteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        RadioGroup radioGroup = findViewById(R.id.radio_answers);
        sqLiteController = new SQLiteController(this);

        Cursor c = sqLiteController.getAnswers();
        int index = c.getColumnIndexOrThrow(Contract.AnswerColumn.ANSWER);

        while(c.moveToNext())
        {
            RadioButton radio = createRadioButton(c.getString(index));
            radioGroup.addView(radio);
        }
    }

    private RadioButton createRadioButton(String answer)
    {
        RadioButton radio = new RadioButton(this);

        RadioGroup.LayoutParams params = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
        );
        radio.setTextSize(24);
        radio.setLayoutParams(params);
        radio.setText(answer);
        radio.setTag(answer);

        return radio;
    }
}

package com.app.practica_7_usocheckboxes;

/*
 * Convenciones de nombrado en la base de datos SQLite local
 */

import android.provider.BaseColumns;

public class Contract {

    interface AnswerColumn
    {
        String ANSWER = "answer";
    }

    interface Tables
    {
        String ANSWERS = "answers";
    }

    private Contract(){}

    public static final String scriptCreate = "CREATE TABLE " + Tables.ANSWERS + "(" +
            BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            AnswerColumn.ANSWER + " TEXT UNIQUE NOT NULL)";

    public static final String scriptUpgrage = "DROP TABLE IF EXISTS " + Tables.ANSWERS;
}

package com.app.practica_7_usocheckboxes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class SQLiteController extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "questions.db";
    private static final int DATABASE_VERSION = 1;
    private Context context;

    public SQLiteController(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Contract.scriptCreate);

        ContentValues cv = new ContentValues();
        cv.put(Contract.AnswerColumn.ANSWER, "A. León");
        db.insert(Contract.Tables.ANSWERS, BaseColumns._ID, cv);
        cv.put(Contract.AnswerColumn.ANSWER, "B. Jaguar");
        db.insert(Contract.Tables.ANSWERS, BaseColumns._ID, cv);
        cv.put(Contract.AnswerColumn.ANSWER, "C. Ratón");
        db.insert(Contract.Tables.ANSWERS, BaseColumns._ID, cv);
        cv.put(Contract.AnswerColumn.ANSWER, "D. Cocodrilo");
        db.insert(Contract.Tables.ANSWERS, BaseColumns._ID, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Contract.scriptUpgrage);
        onCreate(db);
    }

    public Cursor getAnswers()
    {
        SQLiteDatabase db = getReadableDatabase();
        return db.query(Contract.Tables.ANSWERS,
                null,
                null,
                null,
                null,
                null,
                null);
    }
}

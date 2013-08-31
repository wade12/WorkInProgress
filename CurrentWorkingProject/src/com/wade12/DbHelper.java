package com.wade12;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "data";
	public static final String TABLE_NAME = "comments_table";
	public static final String C_ID = "_id";
	public static final String NAME = "name";
	public static final String COMMENT = "comment";
	public static final String EMAIL = "email";
	public static final String TIME = "time";

	public final String createDb = "create table if not exists " + TABLE_NAME + " ( " + C_ID + "integer primary key autoincrement, " + NAME
			+ "text, " + COMMENT + "text, " + EMAIL + "text, " + TIME + "text); ";

	public DbHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, DATABASE_NAME, factory, version);
	} // end method DbHelper

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(createDb);
	} // end method onCreate

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table" + TABLE_NAME);
	} // end method onUpgrade

} // end Class DbHelper

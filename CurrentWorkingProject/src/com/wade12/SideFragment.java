package com.wade12;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SideFragment extends Fragment {

	View view;
	SQLiteDatabase db;
	DbHelper dbhelper;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstatnceState) {

		dbhelper = new DbHelper(getActivity());
		db.dbhelper.getWritableDatabase();
		view = inflater.inflate(R.layout.new_activity, container, false);
		Button button = (Button) view.findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {

				String name;
				String comment;
				String email;

				EditText nameIn = (EditText) view.findViewById(R.id.nameIn);
				EditText commentIn = (EditText) view.findViewById(R.id.commentIn);
				EditText emailIn = (EditText) view.findViewById(R.id.emailIn);

				name = nameIn.getText().toString();
				comment = commentIn.getText().toString();
				email = emailIn.getText().toString();

				ContentValues cv = new ContentValues();

				cv.put(DbHelper.NAME, name);
				cv.put(DbHelper.COMMENT, comment);
				cv.put(DbHelper.EMAIL, email);

				db.insert(DbHelper.TABLE_NAME, null, cv);

				/*
				 * TextView nameOut = (TextView) view.findViewById(R.id.name);
				 * TextView commentOut = (TextView)
				 * view.findViewById(R.id.comment); TextView otherOut =
				 * (TextView) view.findViewById(R.id.other);
				 * 
				 * nameOut.setText(name); commentOut.setText(comment);
				 * otherOut.setText(other);
				 */

			} // end method onClick
		}); // end OnclickListener

		return view;
	} // end method
} // end Class SideFragment

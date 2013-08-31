package com.wade12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SideFragment extends Fragment {

	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstatnceState) {

		view = inflater.inflate(R.layout.new_activity, container, false);
		Button button = (Button) view.findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			public void onClick(View view) {

				String name;
				String comment;
				String other;

				EditText nameIn = (EditText) view.findViewById(R.id.nameIn);
				EditText commentIn = (EditText) view.findViewById(R.id.commentIn);
				EditText otherIn = (EditText) view.findViewById(R.id.otherIn);

				name = nameIn.getText().toString();
				comment = commentIn.getText().toString();
				other = otherIn.getText().toString();

				TextView nameOut = (TextView) view.findViewById(R.id.name);
				TextView commentOut = (TextView) view.findViewById(R.id.comment);
				TextView otherOut = (TextView) view.findViewById(R.id.other);

				nameOut.setText(name);
				commentOut.setText(comment);
				otherOut.setText(other);

			} // end method onClick
		}); // end OnclickListener

		return view;
	} // end method
} // end Class SideFragment

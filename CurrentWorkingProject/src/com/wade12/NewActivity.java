package com.wade12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

public class NewActivity extends BaseActivity {

	private final String TAG = "NewActivity";

	TextView nameOut;

	Fragment picture = new PictureFragment();
	Fragment side = new SideFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_activity);

		FragmentManager fragMan = getSupportFragmentManager();
		FragmentTransaction fragTrans = fragMan.beginTransaction();
		Fragment frag = new SideFragment();
		fragTrans.replace(R.id.fragment_frame, frag, "SIDE");
		fragTrans.commit();

		/*
		 * Intent intent = getIntent(); String text =
		 * intent.getStringExtra("screenText"); Log.i(TAG, "Intent Text = " +
		 * text); if (text != null) { nameOut = (TextView)
		 * findViewById(R.id.name); nameOut.setText(text); } // end if
		 */

	} // end method onCreate

	public void swapFragment() {
		FragmentManager fragManager = getSupportFragmentManager();
		FragmentTransaction fragTransaction = fragManager.beginTransaction();

		Fragment current = fragManager.findFragmentByTag("SIDE");
		if (!current.isVisible())
			fragTransaction.replace(R.id.fragment_frame, picture, "PIC");
		else
			fragTransaction.replace(R.id.fragment_frame, side, "SIDE");

		fragTransaction.addToBackStack(null);
		fragTransaction.commit();

	} // end method swapFragment
	/*
	 * public void submitComment(View view) {
	 * 
	 * String name; String comment; String other;
	 * 
	 * EditText nameIn = (EditText) findViewById(R.id.nameIn); EditText
	 * commentIn = (EditText) findViewById(R.id.commentIn); EditText otherIn =
	 * (EditText) findViewById(R.id.otherIn);
	 * 
	 * name = nameIn.getText().toString(); comment =
	 * commentIn.getText().toString(); other = otherIn.getText().toString();
	 * 
	 * // TextView nameOut = (TextView) findViewById(R.id.name); TextView
	 * commentOut = (TextView) findViewById(R.id.comment); TextView otherOut =
	 * (TextView) findViewById(R.id.other);
	 * 
	 * nameOut.setText(name); commentOut.setText(comment);
	 * otherOut.setText(other);
	 * 
	 * } // end method submitComment
	 */

} // end Class NewActivity

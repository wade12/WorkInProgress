package com.wade12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

public class NewActivity extends BaseActivity {

	private final String TAG = "NewActivity";

	TextView nameOut;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_activity);

		FragmentManager fragman = getSupportFragmentManager();
		FragmentTransaction fragtrans = fragman.beginTransaction();
		Fragment frag = new SideFragment();
		fragtrans.replace(R.id.fragment_frame, frag);

		/*
		 * Intent intent = getIntent(); String text =
		 * intent.getStringExtra("screenText"); Log.i(TAG, "Intent Text = " +
		 * text); if (text != null) { nameOut = (TextView)
		 * findViewById(R.id.name); nameOut.setText(text); } // end if
		 */

	} // end method onCreate

	public void swapFragment() {
		FragmentManager fragManager = getSupportFragmentManager();
		FragmentTransaction fragTransaction = fragman.beginTransaction();
		
		Fragment current = 
		
		
		
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

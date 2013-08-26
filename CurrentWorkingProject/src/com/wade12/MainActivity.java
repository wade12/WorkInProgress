package com.wade12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	private final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i(TAG, "in onCreate");

		/*
		 * Button button = (Button) findViewById(R.id.button1); final TextView
		 * textView = (TextView) findViewById(R.id.textView1);
		 * 
		 * button.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View view) { String text =
		 * textView.getText().toString(); if (text.contains("World")) {
		 * textView.setText("Hello Android!"); } // end if else {
		 * textView.setText("Hello World!"); } // end else } // end method
		 * onClick }); // end OnClickListener;
		 */
	} // end method onCreate

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_menu, menu);
		return true;
	} // end method onCreateOptionsMenu

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.twitter:
			Log.i(TAG, "twitter item clicked");
			return true;

		case R.id.facebook:
			Log.i(TAG, "facebook item clicked");
			return true;

		case R.id.refresh:
			Log.i(TAG, "refresh item clicked");
			return true;

		default:
			return super.onOptionsItemSelected(item);
		} // end switch

	} // end method onOptionsItemSelected

	@Override
	public void onStart() {
		super.onStart();
		Log.i(TAG, "in onStart");
	} // end method onStart

	@Override
	public void onResume() {
		super.onResume();
		Log.i(TAG, "in onResume");
	} // end method onResume()

	// activity is visible and being used.

	@Override
	public void onPause() {
		super.onPause();
		Log.i(TAG, "in onPause");
	} // end method onPause()

	@Override
	public void onStop() {
		super.onStop();
		Log.i(TAG, "in onStop");
	} // end method onStop()

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "in onDestroy");
	} // end method onDestroy()

	public void buttonClick(View view) {

		Log.i(TAG, "starting new activity");
		Intent intent = new Intent(this, NewActivity.class);
		intent.putExtra("screenText", "Hello World!");
		startActivity(intent);

		/*
		 * Log.i(TAG, "button clicked");
		 * 
		 * final TextView textView = (TextView) findViewById(R.id.textView1);
		 * String text = textView.getText().toString();
		 * 
		 * if (text.contains("World")) { textView.setText("Hello Android!"); }
		 * // end if else { textView.setText("Hello World!"); } // end else
		 */
	} // end method buttonClick
} // end Class MainActivity

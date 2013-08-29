package com.wade12;

import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends FragmentActivity {

	private final String TAG = "BaseActivity";

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

} // end Class BaseActivity

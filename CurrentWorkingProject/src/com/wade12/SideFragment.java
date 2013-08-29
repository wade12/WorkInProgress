package com.wade12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SideFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstatnceState) {

		View view = inflater.inflate(R.layout.new_activity, container, false);
		return view;
	} // end method

} // end Class SideFragment

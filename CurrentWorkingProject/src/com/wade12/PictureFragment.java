package com.wade12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PictureFragment extends Fragment {

	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstatnceState) {

		view = inflater.inflate(R.layout.picture_fragment, container, false);

		return view;
	} // end method
} // end Class SideFragment

package com.demo.navdrawer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends android.support.v4.app.Fragment{
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View rootview=inflater.inflate(R.layout.activity_nav_drawer, container,false);
			System.out.println("called mainfragment");
			return rootview;
			}

}

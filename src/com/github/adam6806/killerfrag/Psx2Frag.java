package com.github.adam6806.killerfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Psx2Frag extends Fragment
{
	
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState)
  {
    View rootView = inflater.inflate(R.layout.psx2_layout, container, false);
    return rootView;
  }
}

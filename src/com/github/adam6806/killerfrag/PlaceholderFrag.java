package com.github.adam6806.killerfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment creator
 */
public class PlaceholderFrag extends Fragment
{

  // layout for place holder is in fragment_main
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState)
  {
    View rootView = inflater
        .inflate(R.layout.fragment_main, container, false);
    return rootView;
  }
}

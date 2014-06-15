package com.github.adam6806.killerfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment creator
 */
public abstract class PlaceholderFrag extends Fragment
{

  // layout for place holder is in fragment_main
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState)
  {
	  View rootView = inflater.inflate(R.layout.fragment_main, container, false);
	    
		TextView systemName = (TextView) rootView.findViewById(R.id.systemName);
		systemName.setText(getSystemName());
		
		TextView emulatorName = (TextView) rootView.findViewById(R.id.emulatorName);
		emulatorName.setText(getEmulatorName());
		
		TextView description = (TextView) rootView.findViewById(R.id.description);
		description.setText(getDescription());
		
		TextView instructions = (TextView) rootView.findViewById(R.id.instructions);
		instructions.setText(getInstructions());
		
		TextView linksList = (TextView) rootView.findViewById(R.id.linksList);
		linksList.setText(getLinkList());
		
    return rootView;
    
  }
  
  protected abstract String getSystemName();
  
  protected abstract String getEmulatorName();
  
  protected abstract String getDescription();
  
  protected abstract String getInstructions();
  
  protected abstract String getLinkList();
}

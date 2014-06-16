package com.github.adam6806.killerfrag;

import java.util.ArrayList;
import java.util.Collections;

import com.github.adam6806.killerfrag.systemfrags.ArcadeFrag;
import com.github.adam6806.killerfrag.systemfrags.AtariFrag;
import com.github.adam6806.killerfrag.systemfrags.GameboyFrag;
import com.github.adam6806.killerfrag.systemfrags.N64Frag;
import com.github.adam6806.killerfrag.systemfrags.NesFrag;
import com.github.adam6806.killerfrag.systemfrags.PSX2Frag;
import com.github.adam6806.killerfrag.systemfrags.PsxFrag;
import com.github.adam6806.killerfrag.systemfrags.SegaFrag;
import com.github.adam6806.killerfrag.systemfrags.SnesFrag;
import com.github.adam6806.killerfrag.systemfrags.WiiCubeFrag;
import com.github.adam6806.killerfrag.systemfrags.XboxFrag;

import android.app.Fragment;
import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListFrag extends ListFragment
{

  // fragment objects
  static Fragment psxFrag;
  static Fragment psx2Frag;
  static Fragment nesFrag;
  static Fragment snesFrag;
  static Fragment n64Frag;
  static Fragment wiicubeFrag;
  static Fragment segaFrag;
  static Fragment xboxFrag;
  static Fragment arcadeFrag;
  static Fragment atariFrag;
  static Fragment gameboyFrag;

  ArrayList<String> values = new ArrayList();
  
  public ListFrag() {
	  values.add("Playstation"); 
		values.add("Playstation 2"); 
		values.add("Nintendo"); 
		values.add("Super Nintendo");
		values.add("Nintendo 64"); 
		values.add("Wii/Gamecube"); 
		values.add("Sega"); 
		values.add("Xbox" ); 
		values.add("Arcade"); 
		values.add("Atari"); 
		values.add("Gameboy");
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState)
  {
	  
	Collections.sort(values);

    View listView = inflater.inflate(R.layout.startlist_layout, null);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
        android.R.layout.simple_list_item_1, values);

    setListAdapter(adapter);

    // Initialize fragment objects
    psxFrag = new PsxFrag();
    psx2Frag = new PSX2Frag();
    nesFrag = new NesFrag();
    snesFrag = new SnesFrag();
    n64Frag = new N64Frag();
    wiicubeFrag = new WiiCubeFrag();
    segaFrag = new SegaFrag();
    xboxFrag = new XboxFrag();
    arcadeFrag = new ArcadeFrag();
    atariFrag = new AtariFrag();
    gameboyFrag = new GameboyFrag();

    return listView;
  }

  @Override
  public void onActivityCreated(Bundle b)
  {
    super.onActivityCreated(b);
  }

  @Override
  public void onListItemClick(ListView l, View v, int position, long id)
  {
    // do something with the data
    CharSequence msg = "Clicked at " + position + ", \"" + values.get(position)
        + "\"";

    Log.i("ListItem", values.get(position) + " was clicked\n" + v);
    v.setBackgroundColor(Color.WHITE);
    v.invalidate();

    if (values.get(position) == "Playstation")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, psxFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Playstation 2")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, psx2Frag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Nintendo")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, nesFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Super Nintendo")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, snesFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Nintendo 64")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, n64Frag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Wii/Gamecube")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, wiicubeFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Sega")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, segaFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Xbox")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, xboxFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Arcade")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, arcadeFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Atari")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, atariFrag)
          .addToBackStack(null).commit();
    }
    else if (values.get(position) == "Gameboy")
    {
    	getActivity().setTitle(values.get(position));
      v.setBackgroundColor(Color.RED);
      getFragmentManager().beginTransaction().replace(R.id.container, gameboyFrag)
          .addToBackStack(null).commit();
    }
  }

} // fragment class

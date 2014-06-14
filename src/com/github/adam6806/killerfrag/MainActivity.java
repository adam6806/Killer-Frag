package com.github.adam6806.killerfrag;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity
{

  // fragment objects
  static PsxFrag psxFrag;
  static ListFrag listFrag;
  static PlaceholderFragment placeHolderFrag;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Initialize fragment objects
    psxFrag = new PsxFrag();
    listFrag = new ListFrag();
    placeHolderFrag = new PlaceholderFragment();

    // start the "listFrag" fragment immediately if there is no saved instance
    if (savedInstanceState == null)
    {
      getFragmentManager().beginTransaction().add(R.id.container, listFrag)
          .commit();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {

    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    // Pulled this code from the text available on the course site
    int id = item.getItemId();
    switch (id)
    {
    case R.id.action_settings:
      return true;

      // if show list is pressed, replace fragments "listFrag" with test, and put
      // "listFrag"
      // at the back of the stack
    case R.id.show_list:
      getFragmentManager().beginTransaction().replace(R.id.container, listFrag)
          .addToBackStack(null).commit();
      return true;

      // if back is pressed, pop the back of the fragment stack, in this case
      // "listFrag"
      // I think that the back of the stack should always be our list fragment
    case R.id.back:
    	getFragmentManager().beginTransaction().replace(R.id.container, listFrag)
        .addToBackStack(null).commit();
      return true;

    }
    return super.onOptionsItemSelected(item);
  }

  /**
   * A placeholder fragment creator
   */
  public static class PlaceholderFragment extends Fragment
  {

    public PlaceholderFragment()
    {
    }

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

  // test frag creator
  public static class PsxFrag extends Fragment
  {

    public PsxFrag()
    {
    }

    // test frag layout in psx_layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
      View rootView = inflater.inflate(R.layout.psx_layout, container, false);
      return rootView;
    }
  }

  public static class ListFrag extends ListFragment
  {
    String[] values = new String[]
    { "Playstation", "Playstation 2", "Nintendo", "Super Nintendo", "Nintendo 64", "Wii", "Sega" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
      
      View listView = inflater.inflate(R.layout.startlist_layout, null);
      
      ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
          android.R.layout.simple_list_item_1, values);
      
      setListAdapter(adapter);
      
      return listView;
    }

    @Override
    public void onActivityCreated(Bundle b)
    {
      super.onActivityCreated(b);
      // Log.i(null, "onActivityCreated:");
    } // onActivity

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
      // do something with the data
      CharSequence msg = "Clicked at " + position + ", \"" + values[position]
          + "\"";
      Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
      Log.i("ListItem", values[position] + " was clicked\n" + v);
      v.setBackgroundColor(Color.WHITE);
      v.invalidate();

      if (values[position] == "Playstation")
      {
        v.setBackgroundColor(Color.RED);
        getFragmentManager().beginTransaction().replace(R.id.container, psxFrag)
            .addToBackStack(null).commit();
      }
      else {
    	  v.setBackgroundColor(Color.RED);
          getFragmentManager().beginTransaction().replace(R.id.container, placeHolderFrag)
              .addToBackStack(null).commit();
      }
    }

  } // fragment class

  // this is code to read the hardware keys
  // so if this back button on the phone is pressed, it will pop the back
  // of the frag stack
  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event)
  {
    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0)
    {
      // do something on back.
      getFragmentManager().popBackStack();
      return true;
    }

    return super.onKeyDown(keyCode, event);
  }
  // 3037630968
}

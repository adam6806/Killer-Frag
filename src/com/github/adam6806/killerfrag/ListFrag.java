package com.github.adam6806.killerfrag;

import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListFrag extends ListFragment {

	// fragment objects
	static PsxFrag psxFrag;
	static Psx2Frag psx2Frag;
	static PlaceholderFrag placeHolderFrag;

	String[] values = new String[] { "Playstation", "Playstation 2",
			"Nintendo", "Super Nintendo", "Nintendo 64", "Wii", "Sega" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View listView = inflater.inflate(R.layout.startlist_layout, null);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, values);

		setListAdapter(adapter);

		// Initialize fragment objects
		psxFrag = new PsxFrag();
		placeHolderFrag = new PlaceholderFrag();
		psx2Frag = new Psx2Frag();

		return listView;
	}

	@Override
	public void onActivityCreated(Bundle b) {
		super.onActivityCreated(b);
		// Log.i(null, "onActivityCreated:");
	} // onActivity

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// do something with the data
		CharSequence msg = "Clicked at " + position + ", \"" + values[position]
				+ "\"";
		Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
		Log.i("ListItem", values[position] + " was clicked\n" + v);
		v.setBackgroundColor(Color.WHITE);
		v.invalidate();

		// String[] valuestest = new String[]
		// { "Playstation", "Playstation 2", "Nintendo", "Super Nintendo",
		// "Nintendo 64", "Wii", "Sega" };

		if (values[position] == "Playstation") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, psxFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Playstation 2") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, psx2Frag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Super Nintendo") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, placeHolderFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Nintendo 64") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, placeHolderFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Wii") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, placeHolderFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Sega") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, placeHolderFrag).addToBackStack(null)
					.commit();
		} else {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, placeHolderFrag)
					.addToBackStack(null).commit();
		}
	}

} // fragment class

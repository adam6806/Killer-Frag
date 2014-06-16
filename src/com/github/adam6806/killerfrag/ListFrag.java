package com.github.adam6806.killerfrag;

import com.github.adam6806.killerfrag.systemfrags.N64Frag;
import com.github.adam6806.killerfrag.systemfrags.NesFrag;
import com.github.adam6806.killerfrag.systemfrags.PSX2Frag;
import com.github.adam6806.killerfrag.systemfrags.PsxFrag;
import com.github.adam6806.killerfrag.systemfrags.SegaFrag;
import com.github.adam6806.killerfrag.systemfrags.SnesFrag;
import com.github.adam6806.killerfrag.systemfrags.WiiFrag;

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

public class ListFrag extends ListFragment {

	// fragment objects
	static Fragment psxFrag;
	static Fragment psx2Frag;
	static Fragment nesFrag;
	static Fragment snesFrag;
	static Fragment n64Frag;
	static Fragment wiiFrag;
	static Fragment segaFrag;

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
		psx2Frag = new PSX2Frag();
		nesFrag = new NesFrag();
		snesFrag = new SnesFrag();
		n64Frag = new N64Frag();
		wiiFrag = new WiiFrag();
		segaFrag = new SegaFrag();
		
		return listView;
	}

	@Override
	public void onActivityCreated(Bundle b) {
		super.onActivityCreated(b);
	} 

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// do something with the data
		CharSequence msg = "Clicked at " + position + ", \"" + values[position]
				+ "\"";
		
		Log.i("ListItem", values[position] + " was clicked\n" + v);
		v.setBackgroundColor(Color.WHITE);
		v.invalidate();

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
		} else if (values[position] == "Nintendo") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, nesFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Super Nintendo") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, snesFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Nintendo 64") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, n64Frag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Wii") {
						
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, wiiFrag).addToBackStack(null)
					.commit();
		} else if (values[position] == "Sega") {
			v.setBackgroundColor(Color.RED);
			getFragmentManager().beginTransaction()
					.replace(R.id.container, segaFrag).addToBackStack(null)
					.commit();
		}
	}

} // fragment class

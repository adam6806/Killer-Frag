package com.github.adam6806.killerfrag;

import com.github.adam6806.killerfrag.systemfrags.AboutFrag;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	static ListFrag listFrag;
	static AboutFrag aboutFrag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listFrag = new ListFrag();
		aboutFrag = new AboutFrag();

		// start the "listFrag" fragment immediately if there is no saved
		// instance
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, listFrag).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Pulled this code from the text available on the course site
		int id = item.getItemId();
		switch (id) {
		case R.id.about:
		  this.setTitle("Information");
		  getFragmentManager().beginTransaction()
      .replace(R.id.container, aboutFrag).addToBackStack(null)
      .commit();
			return true;

			// if show list is pressed, replace fragments "listFrag" with test,
			// and put
			// "listFrag"
			// at the back of the stack
		case R.id.show_list:
			this.setTitle("Killer Frag");
			getFragmentManager().beginTransaction()
					.replace(R.id.container, listFrag).addToBackStack(null)
					.commit();
			return true;

			// if back is pressed, pop the back of the fragment stack, in this
			// case
			// "listFrag"
			// I think that the back of the stack should always be our list
			// fragment
		case R.id.back:
			this.setTitle("Killer Frag");
			getFragmentManager().beginTransaction()
					.replace(R.id.container, listFrag).addToBackStack(null)
					.commit();
			return true;

		}
		return super.onOptionsItemSelected(item);
	}

	// this is code to read the hardware keys
	// so if this back button on the phone is pressed, it will pop the back
	// of the frag stack
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			// do something on back.
			this.setTitle("Killer Frag");
			getFragmentManager().popBackStack();
			return true;
		}

		return super.onKeyDown(keyCode, event);
	}
	// 3037630968
}

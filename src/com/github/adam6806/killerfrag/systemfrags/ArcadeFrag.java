package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;


public class ArcadeFrag extends PlaceholderFrag {

	@Override
	protected String getSystemName() {
		return "Arcade";
	}

	@Override
	protected String getEmulatorName() {
		return "Arcade Emulator Name";
	}

	@Override
	protected String getDescription() {
		return "Arcade description of Arcade emulator. Blah blah blah placeholder";
	}

	@Override
	protected String getInstructions() {
		return "Arcade emulator install instructions of Arcade emulator. Blah blah blah placeholder";
	}

	@Override
	protected String getLinkList() {
		return " - http://www.somelink.com\n - http://www.someotherlink.com";
	}

	@Override
	protected ArrayList<Integer> getImageIds() {
		ArrayList<Integer> imageIds = new ArrayList();
		imageIds.add(R.drawable.atari2600);
		imageIds.add(R.drawable.gameboy);
		imageIds.add(R.drawable.mame);
		imageIds.add(R.drawable.neogeo);
		imageIds.add(R.drawable.nintendo);
		imageIds.add(R.drawable.nintendo64);
		imageIds.add(R.drawable.segadreamcast);
		imageIds.add(R.drawable.segagenesis);
		imageIds.add(R.drawable.snes);
		imageIds.add(R.drawable.xbox);
		return imageIds;
	}

}

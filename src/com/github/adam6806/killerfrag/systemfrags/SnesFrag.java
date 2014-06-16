package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;


public class SnesFrag extends PlaceholderFrag {

	@Override
	protected String getSystemName() {
		return "Super Nintendo";
	}

	@Override
	protected String getEmulatorName() {
		return "SNES9X";
	}

	@Override
	protected String getDescription() {
		return "SNES9X is the clear victor in the battle for the ultimate SNES emulator. It is the most compatible of the two we recommend — it’s capable of running even the later Super Famicom releases — and also comes equipped with a ton of great features that have been continually honed and refined over the years such as image upscaling, video filters, cheats, and online multiplayer. The Turbo Mode is another awesome feature for power leveling and fast-forwarding through games that seem to move along at a snail’s pace. Ports include everything from Windows and Mac OS X to mobile versions for the iOS and Android.";
	}

	@Override
	protected String getInstructions() {
		return "I suggest you make a new folder called \"SNES\" within a folder called \"Emulation\". You don't have to, but it makes things a little easier for you if you're not too computer literate. Extract all the contents of this emulator's zip file into the SNES folder. A \"Roms\" folder should be there - I recommend tossing all your SNES ROMs there. Snes9X has zip support, so you do not have to extract ROMs from their zip files. Double-click on \"snes9x\" to open it.";
	}

	@Override
	protected String getLinkList() {
		return " - http://www.snes9x.com/\n - http://www.fantasyanime.com/emuhelp/emuhelp_snes9x.htm";
	}

	@Override
	protected ArrayList<Integer> getImageIds() {
		ArrayList<Integer> imageIds = new ArrayList();
		imageIds.add(R.drawable.snes9xmario);
		imageIds.add(R.drawable.snes9xandroid);
		imageIds.add(R.drawable.snes9xcontroller);
		imageIds.add(R.drawable.snes9xiphone);
		imageIds.add(R.drawable.snes9xrecent);
		imageIds.add(R.drawable.snes9xrecord);
		return imageIds;
	}

}

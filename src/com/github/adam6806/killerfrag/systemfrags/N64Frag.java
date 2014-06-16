package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;


public class N64Frag extends PlaceholderFrag {

	@Override
	protected String getSystemName() {
		return "Nintendo 64";
	}

	@Override
	protected String getEmulatorName() {
		return "Project 64";
	}

	@Override
	protected String getDescription() {
		return "Project 64 is one of the most compatible Nintendo 64 emulators out there and doesn’t require an sort of BIOS image like its PlayStation counterpart. The default plugins, though rather low-level in nature, work surprisingly well in mimicking the 64's original audio and video components. The emulator isn’t too heavy on features, though there is multiplayer support, cheat functionality, and an intuitive tool for altering the the aspect ratio without any unnecessary cropping or stretching that would compromise the original viewing experience. Visually it’s not as striking as the real thing, but the emulator does to a nice job recreating the experience if you have a decent graphics card and RAM. It’s a pretty straightforward emulator, but its a fine option that one of the first to be introduced in the wake of UltraHLE’s unfortunate discontinuation.";
	}

	@Override
	protected String getInstructions() {
		return "The current version of Project64 is provided from the website with a Windows installer. Download and double click the install file after downloading. You will be prompted for the path on your hard drive where you would like Project64 to reside (or use the default path, which is in Program Files) and continue to click Next through the installer. Run Project64 from the shortcut in your Start Menu. All the necessary files to get you started and playing N64 games are included (apart from the games themselves!). You will be asked to choose a language the first time PJ64 is run.";
	}

	@Override
	protected String getLinkList() {
		return " - http://www.pj64-emu.com/\n - http://www.pj64-emu.com/manual-and-guides/";
	}

	@Override
	protected ArrayList<Integer> getImageIds() {
		ArrayList<Integer> imageIds = new ArrayList();
		imageIds.add(R.drawable.n64mario);
		imageIds.add(R.drawable.n64controller);
		imageIds.add(R.drawable.n64language);
		imageIds.add(R.drawable.n64roms);
		return imageIds;
	}

}

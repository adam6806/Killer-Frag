package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;


public class AtariFrag extends PlaceholderFrag {

	@Override
	protected String getSystemName() {
		return "Atari";
	}

	@Override
	protected String getEmulatorName() {
		return "Stella";
	}

	@Override
	protected String getDescription() {
		return "Stella is a multi-platform Atari 2600 VCS emulator released under the GNU General Public License (GPL). Stella was originally developed for Linux by Bradford W. Mott, and is currently maintained by Stephen Anthony. Since its original release several people have joined the development team to port Stella to other operating systems such as AcornOS, AmigaOS, DOS, FreeBSD, IRIX, Linux, OS/2, MacOS, Unix, and Windows.";
	}

	@Override
	protected String getInstructions() {
		return "Download the binary for your platform from the link provided below. Double-click on the installer and follow the onscreen instructions.";
	}

	@Override
	protected String getLinkList() {
		return " - http://stella.sourceforge.net/";
	}

	@Override
	protected ArrayList<Integer> getImageIds() {
		ArrayList<Integer> imageIds = new ArrayList();
		imageIds.add(R.drawable.stellaberzerk);
		imageIds.add(R.drawable.stellachoppercommand);
		imageIds.add(R.drawable.stellahero);
		imageIds.add(R.drawable.stellakeystone);
		imageIds.add(R.drawable.stellalauncher);
		return imageIds;
	}

}

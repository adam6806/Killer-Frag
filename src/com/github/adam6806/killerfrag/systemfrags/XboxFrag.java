package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;


public class XboxFrag extends PlaceholderFrag {

	@Override
	protected String getSystemName() {
		return "Xbox";
	}

	@Override
	protected String getEmulatorName() {
		return "CXBX";
	}

	@Override
	protected String getDescription() {
    return "Even though this is not really an emulator, and only 5 games are playable, it was worth somewhat of a mention...\nSince there is not a good Xbox Emulator, we suggest finding the games for PS2 or PC instead.";
	}

	@Override
	protected String getInstructions() {
		return "Download CXBX 0.7.8c.zip, extract to download folder, then run the inside of the folder. Follow onscreen instructions from there.";
	}

	@Override
	protected String getLinkList() {
		return " - http://www.caustik.com/cxbx/download.htm\n - http://www.emulator-zone.com/doc.php/xbox/cxbx.html";
	}

	@Override
	protected ArrayList<Integer> getImageIds() {
		ArrayList<Integer> imageIds = new ArrayList();
		imageIds.add(R.drawable.cxbxwindow);
		imageIds.add(R.drawable.cxbxinputconfig);
		imageIds.add(R.drawable.cxbxvideoconfig);
		imageIds.add(R.drawable.cxbxfuturama);
		
		return imageIds;
	}

}

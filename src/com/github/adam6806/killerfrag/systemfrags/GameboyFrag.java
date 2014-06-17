package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;


public class GameboyFrag extends PlaceholderFrag {

	@Override
	protected String getSystemName() {
		return "Gameboy";
	}

	@Override
	protected String getEmulatorName() {
		return "Visual Boy Advance";
	}

	@Override
	protected String getDescription() {
		return "VisualBoyAdvance (commonly abbreviated as VBA) is a free emulator of the Game Boy, Game Boy Color, and Game Boy Advance handheld game consoles as well as of Super Game Boy and Super Game Boy 2. Besides the DirectX version for the Windows platform, there is also one that is based on the free platform independent graphics library SDL. This is available for a variety of operating systems including Linux, BSD, Mac OS X, and BeOS. VisualBoyAdvance has also been ported to AmigaOS 4, GameCube, Wii, webOS, and Zune HD";
	}

	@Override
	protected String getInstructions() {
		return "Follow instructions found here http://www.mameworld.info/easyemu/VBAGuide/vba-guide.html";
	}

	@Override
	protected String getLinkList() {
		return " - http://www.emulator-zone.com/doc.php/gba/vboyadvance.html\n - http://en.wikipedia.org/wiki/VisualBoyAdvance";
	}


	@Override
	protected ArrayList<Integer> getImageIds() {
		ArrayList<Integer> imageIds = new ArrayList();
		imageIds.add(R.drawable.vbacastl);
		imageIds.add(R.drawable.vbafifa07);
		imageIds.add(R.drawable.vbafoster);
		imageIds.add(R.drawable.vbaincred);
		imageIds.add(R.drawable.vbamksc);
		imageIds.add(R.drawable.vbapokesap);
		imageIds.add(R.drawable.vbasma);
		imageIds.add(R.drawable.vbassa);
		imageIds.add(R.drawable.vbaswars);
		return imageIds;
	}

}

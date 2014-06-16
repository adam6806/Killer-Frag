package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;

public class WiiCubeFrag extends PlaceholderFrag
{

  @Override
  protected String getSystemName()
  {
    return "Wii/Gamecube";
  }

  @Override
  protected String getEmulatorName()
  {
    return "Dolphin";
  }

  @Override
  protected String getDescription()
  {
    return "This is an incredible emulator on several levels! First, and formost, this installation is easy and accessable for PC/Mac/Linux/Android. Secondly, not only does this emulator run Gamecube games, which is what it is famous for, but it also runs Wii games. Next, it can be setup for specific CPU's and GPU's. Lastly, and most importantly, there is a create forum community for technichal support.";
  }

  @Override
  protected String getInstructions()
  {
    return "Installation: Simply just download the runnable files for you specific operating system.\nSetup: Follow the guides for preformance and controller setup.";
  }

  @Override
  protected String getLinkList()
  {
    return " - https://dolphin-emu.org/download/\n - https://dolphin-emu.org/docs/guides/ - https://forums.dolphin-emu.org/";
  }

  @Override
  protected ArrayList<Integer> getImageIds()
  {
    ArrayList<Integer> imageIds = new ArrayList();
    imageIds.add(R.drawable.dolphinwindow);
    imageIds.add(R.drawable.dolphinconfig);
    imageIds.add(R.drawable.dolphindirectxconfig);
    imageIds.add(R.drawable.dolphinopenglconfig);
    imageIds.add(R.drawable.dolphinwiimoteconfig);





    return imageIds;
  }

}

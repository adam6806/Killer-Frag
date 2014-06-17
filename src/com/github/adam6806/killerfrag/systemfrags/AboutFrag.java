package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;

public class AboutFrag extends PlaceholderFrag
{

  @Override
  protected String getSystemName()
  {
    return "Killer-Frag";
  }

  @Override
  protected String getEmulatorName()
  {
    return "About Emulators and ROM/ISO's:";
  }

  @Override
  protected String getDescription()
  {
    return "  Video game emulators are just as useful as they are fun! What an video game emulator actually does is it emulates the hardware of the consol. This is why Xbox emulators are awful, there is virtually no documentations on the hardware itself. Most people use video game emulators to play old video games cross-consol. Another great thing about emulators is it gives the ability to develope games for older consols.\n  As far as ROM's and ISO's, there is no difference; ISO files are just ROM's for disks because of this a cd-reader must read the .cue file to run the .bin files in order. We suggest mounting the .cue files for systems that use ISO images. Otherwise, ROM's from cartiges can just be mounted and ran as one file.";
  }

  @Override
  protected String getInstructions()
  {
    return "Usually video game emulator developers have the installation packages on their website. We suggest installing on a seperate drive in a location with all of the ROM/ISO.";
  }

  @Override
  protected String getLinkList()
  {
    return " - http://en.wikipedia.org/wiki/Video_game_console_emulator";
  }

  @Override
  protected ArrayList<Integer> getImageIds()
  {
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

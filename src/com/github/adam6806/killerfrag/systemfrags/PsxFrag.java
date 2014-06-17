package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;

public class PsxFrag extends PlaceholderFrag
{

  @Override
  protected String getSystemName()
  {
    return "Playstation X";
  }

  @Override
  protected String getEmulatorName()
  {
    return "ePSXe";
  }

  @Override
  protected String getDescription()
  {
    return " This is my, @DirtGrubDylan's, second favorite emulator. Not only are the user's choices limted to a basic set of options, which is pretty handy for users who don't want to a bunch of research, but the actual programs runs as an executable, which means it doesn't need any installation. From this user's experience, the controller interface is the only hard part because there was a transformation of controllers during the Playstation X lifespan; some really old games can only use analog, while others can use a duelshock. All in all, this emulator is reliable and simple! Plus almost every ISO works with it.";
  }

  @Override
  protected String getInstructions()
  {
    return "ePSXe emulator install instructions can be tricky. First you have to download the executable file from the download site, there are executables for Windows, Mac, Linux, and Android. Then you have to run through the set up, this is where the tricky part sets in.\n You have to find a video emulator that is right for you, DirtGrubDylan uses Pete's 3D3 OpenGl; next, you have to find a bios. There are instructions on getting this, but not all are legal or supported, just use Google for this; from here it is a piece of cake!";
  }

  @Override
  protected String getLinkList()
  {
    return " - http://www.wikihow.com/Set-up-a-Playstation-Emulator\n - http://www.epsxe.com/download.php\n - http://www.pbernert.com/html/gpu.htm";
  }

  @Override
  protected ArrayList<Integer> getImageIds()
  {
    ArrayList<Integer> imageIds = new ArrayList();
    imageIds.add(R.drawable.epsxewindow);
    imageIds.add(R.drawable.epsxevideoconfig);
    imageIds.add(R.drawable.epsxespuconfig);
    imageIds.add(R.drawable.epsxecontrolconfig);
    return imageIds;
  }

}

  package com.github.adam6806.killerfrag.systemfrags;

import java.util.ArrayList;

import com.github.adam6806.killerfrag.PlaceholderFrag;
import com.github.adam6806.killerfrag.R;

public class NesFrag extends PlaceholderFrag
{

  @Override
  protected String getSystemName()
  {
    return "Nintendo";
  }

  @Override
  protected String getEmulatorName()
  {
    return "FCEUX";
  }

  @Override
  protected String getDescription()
  {
    return "The FCEUX emulator is the go-to emulator of choice for most of the NES community. The all-in-one application offers features for the both the casual and more advanced gamer, providing user-friendly tools for debugging, video recording, ROM-hacking, and creating speedruns. It�s essentially a merger of various forks (when developers take the source code of one piece of software and then go off and develop something else off of it) of FCE Ultra, a previous NES emulator, combining different elements from the assorted forks to create more advanced emulation software. Ports include Windows, Mac OS X and Linux among others.";
  }

  @Override
  protected String getInstructions()
  {
    return "Installing FCEUX is as simple as extracting the files from the .zip file that you downloaded. I�d recommend putting them into a folder called �NES� to separate them from your other emulators. Once the files are extracted, run the FCEUX application. Some sample configuration settings are located in the screenshots below.";
  }

  @Override
  protected String getLinkList()
  {
    return " - http://www.fceux.com/web/home.html\n - http://joshmccarty.com/2010/04/installing-and-using-console-emulators-part-1/";
  }

  @Override
  protected ArrayList<Integer> getImageIds()
  {
    ArrayList<Integer> imageIds = new ArrayList();
    imageIds.add(R.drawable.fceuxvideoconfig);
    imageIds.add(R.drawable.fceuxinputconfig);
    imageIds.add(R.drawable.fceuxdirconfig);
    return imageIds;
  }

}

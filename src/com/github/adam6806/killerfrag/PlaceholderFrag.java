package com.github.adam6806.killerfrag;

import java.util.ArrayList;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A placeholder fragment creator
 */
public abstract class PlaceholderFrag extends Fragment
{

  private ImageView selectedImage = null;

  // layout for place holder is in fragment_main
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState)
  {

    View rootView = inflater.inflate(R.layout.fragment_main, container, false);

    TextView systemName = (TextView) rootView.findViewById(R.id.systemName);
    systemName.setText(getSystemName());

    TextView emulatorName = (TextView) rootView.findViewById(R.id.emulatorName);
    emulatorName.setText(getEmulatorName());

    TextView description = (TextView) rootView.findViewById(R.id.description);
    description.setText(getDescription());

    if (getInstructions() != null)
    {
      TextView instructions = (TextView) rootView
          .findViewById(R.id.instructions);
      instructions.setText(getInstructions());
    }

    if (getLinkList() != null)
    {
      TextView linksList = (TextView) rootView.findViewById(R.id.linksList);
      linksList.setText(getLinkList());
    }

    if (getLinkList() != null)
    {
      Gallery gallery = (Gallery) rootView.findViewById(R.id.imageGallery);

      gallery.setSpacing(10);
      gallery.setAdapter(new GalleryImageAdapter(this.getActivity(),
          getImageIds()));

      gallery.setOnItemClickListener(new OnItemClickListener()
      {

        @Override
        public void onItemClick(AdapterView<?> arg0, View view, int position,
            long id)
        {

          int imageId = getImageIds().get(position);

          Intent fullScreenIntent = new Intent(view.getContext(),
              FullScreenImage.class);
          fullScreenIntent.putExtra(PlaceholderFrag.class.getName(), imageId);

          startActivity(fullScreenIntent);

        }
      });
    }

    return rootView;

  }

  protected abstract String getSystemName();

  protected abstract String getEmulatorName();

  protected abstract String getDescription();

  protected abstract String getInstructions();

  protected abstract String getLinkList();

  protected abstract ArrayList<Integer> getImageIds();
}

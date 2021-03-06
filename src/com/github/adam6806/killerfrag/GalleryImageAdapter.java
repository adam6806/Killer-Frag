package com.github.adam6806.killerfrag;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter 
{
    private Context mContext;
    private ArrayList<Integer> mImageIds;

    public GalleryImageAdapter(Context context, ArrayList ids) 
    {
        mContext = context;
        mImageIds = ids;
    }

    public int getCount() {
        return mImageIds.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup) 
    {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);

        i.setImageResource(mImageIds.get(index));
        i.setLayoutParams(new Gallery.LayoutParams(400, 400));
    
        i.setScaleType(ImageView.ScaleType.FIT_XY);

        return i;
    }
}

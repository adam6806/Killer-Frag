package com.github.adam6806.killerfrag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenImage extends Activity {
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.full_image);
		Intent intent = getIntent();
		int imageId = (Integer) intent.getExtras().get(
				PlaceholderFrag.class.getName());
		TouchImageView imageView = (TouchImageView) findViewById(R.id.fullImage);

		imageView.setImageResource(imageId);
		imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

	}
}

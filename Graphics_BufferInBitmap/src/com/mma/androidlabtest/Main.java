package com.mma.androidlabtest;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class Main extends Activity {
			 
	ImageView imageView;

	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		Bitmap bitmap = Bitmap.createBitmap ((int)getWindowManager().getDefaultDisplay().getWidth(), (int)getWindowManager().getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas (bitmap);
		imageView = (ImageView)this.findViewById (R.id.imageView);
		imageView.setImageBitmap (bitmap);
		Paint paint = new Paint();
		paint.setColor (Color.RED);
		canvas.drawLine (10, 10, 100, 300, paint);
	}
}

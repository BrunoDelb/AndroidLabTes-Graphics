package com.mma.androidlabtest;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageView imageView = (ImageView)findViewById (R.id.imageView);
		Bitmap bitmap = Bitmap.createBitmap(getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas (bitmap);
		imageView.setImageBitmap(bitmap);
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);
		paint.setTextSize(30);
		canvas.drawText("Helloworld", 5, 200, paint);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

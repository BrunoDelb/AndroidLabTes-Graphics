package com.mma.androidlabtest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    
    private static class MyView extends View {
        
        Typeface typeface;
        
        public MyView(Context context) {
            super(context);
            setFocusable(true);
            typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/myfont.ttf");
        }
        
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);       
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setTextSize(64);
            paint.setTypeface(null);
            canvas.drawText("Default font", 10, 100, paint);
            paint.setTypeface(typeface);
            canvas.drawText("My font", 10, 200, paint);
        }
    }
}

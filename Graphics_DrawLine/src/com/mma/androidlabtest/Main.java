package com.mma.androidlabtest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    
    private static class MyView extends View {
        
        public MyView(Context context) {
            super(context);
            setFocusable(true);
        }
        
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);       
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(4);
            paint.setColor(Color.RED);
    		canvas.drawLine (10, 10, 100, 300, paint);
        }
    }
}

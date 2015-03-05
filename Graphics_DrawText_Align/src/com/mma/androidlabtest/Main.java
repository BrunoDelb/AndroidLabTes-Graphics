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
            paint.setColor(Color.RED);
            paint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText("Left", 200, 200, paint);
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("Center", 200, 200, paint);
            paint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText("Right", 200, 200, paint);
        }
    }
}

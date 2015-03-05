package com.mma.androidlabtest;

import android.app.Activity;
import android.content.Context;
import android.graphics.*;
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
        }
        
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);            
            canvas.clipRect(0, 0, 100, 100);
            canvas.drawColor(Color.BLUE);
            canvas.clipRect(50, 50, 80, 80, Region.Op.DIFFERENCE);
            canvas.drawColor(Color.RED);
        }
    }
}

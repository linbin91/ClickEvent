package com.felink.clickevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Administrator on 2017/1/8.
 */

public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("linbin","button ACTION_DOWN");
            break;
            case MotionEvent.ACTION_MOVE:
                Log.e("linbin","button ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("linbin","button ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e("linbin","button ACTION_CANCEL");
                break;
        }
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}

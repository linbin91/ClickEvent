package com.felink.clickevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/1/8.
 */

public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("linbin","MyLinearLayout onTouchEvent ACTION_DOWN");
            case MotionEvent.ACTION_MOVE:
                Log.e("linbin","MyLinearLayout onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("linbin","MyLinearLayout onTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e("linbin","MyLinearLayout onTouchEvent ACTION_CANCEL");
                break;
        }
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("linbin","MyLinearLayout onInterceptTouchEvent ACTION_DOWN");
            case MotionEvent.ACTION_MOVE:
                Log.e("linbin","MyLinearLayout onInterceptTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("linbin","MyLinearLayout onInterceptTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e("linbin","MyLinearLayout onInterceptTouchEvent ACTION_CANCEL");
                break;
        }
        return false;
    }
}

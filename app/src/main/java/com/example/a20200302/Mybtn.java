package com.example.a20200302;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class Mybtn extends AppCompatButton {
    public Mybtn(Context context) {
        super(context);
        init(context);
    }

    public Mybtn(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public void init(Context context){
        setBackgroundColor(Color.CYAN);
        setTextColor(Color.BLACK);
        float textsize = getResources().getDimension(R.dimen.text_defalt);
        setTextSize(textsize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action =event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                setBackgroundColor(Color.BLUE);
                setTextColor(Color.RED);
                setTextSize(getResources().getDimension(R.dimen.text_big));
                break;
            case MotionEvent.ACTION_UP:
                setBackgroundColor(Color.CYAN);
                setTextColor(Color.BLACK);
                float textsize = getResources().getDimension(R.dimen.text_defalt);
                setTextSize(textsize);
                break;

        }
        invalidate();

        return true;
    }

}

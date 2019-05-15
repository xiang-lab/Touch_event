package com.exemple.touchevent;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        final TextView input = (TextView) findViewById(R.id.input_event);
//        input.setText(ev.toString());
//        return super.dispatchTouchEvent(ev);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView input = (TextView) findViewById(R.id.input_event);
        input.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                input.setText(event.toString());
                return false;
            }
        });


    }


}

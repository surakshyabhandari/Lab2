package com.example.hellotoast_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    public TextView mShowCount;
    public Button mReset, mCountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.counter);
        mCountBtn = (Button) findViewById(R.id.button2);
        mReset = (Button) findViewById(R.id.button3);
        mCountBtn.setBackgroundColor(Color.BLUE);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hello Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        view.setBackgroundColor(mCount % 2 == 0 ? Color.BLUE : Color.GRAY);
        if (mCount > 0) {
            mReset.setBackgroundColor(Color.RED);
            mReset.setTextColor(Color.WHITE);
        }

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void colourReset(View view) {
        mCount = 0;
        mReset.setBackgroundColor(Color.GRAY);
        mCountBtn.setBackgroundColor(Color.BLUE);

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
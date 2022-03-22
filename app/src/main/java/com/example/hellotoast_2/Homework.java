package com.example.hellotoast_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Homework extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mReset, mCountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
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

        view.setBackgroundColor(mCount % 2 == 0 ? Color.GREEN : Color.BLUE);

        if (mCount > 0) {
            mReset.setBackgroundColor(Color.MAGENTA);
            mReset.setTextColor(Color.WHITE);
        }

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void colourReset(View view) {
        mCount = 0;
        mReset.setBackgroundColor(Color.LTGRAY);
        mCountBtn.setBackgroundColor(Color.BLACK);

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
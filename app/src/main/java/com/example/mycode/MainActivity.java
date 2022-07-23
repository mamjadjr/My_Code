package com.example.mycode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextUtil textUtil = new TextUtil();

        TextView textView = findViewById(R.id.utilTextView);
        textView.setText(textUtil.Utils());

        for (int counter = 0; counter < 10; counter++) {
            Log.i("Message","Value: "+counter);
        }
    }
}
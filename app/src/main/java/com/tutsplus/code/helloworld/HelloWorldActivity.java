package com.tutsplus.code.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set layout
        setContentView(R.layout.activity_hello_world);

        // Get View reference
        mText = (TextView) findViewById(R.id.text);

    }

    public void sayHi(View view) {
        mText.setText("Hello World!");
    }

}

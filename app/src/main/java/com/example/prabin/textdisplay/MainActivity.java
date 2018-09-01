package com.example.prabin.textdisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Change the text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(
                        R.color.change_text_color));
            }
        });

        // Change the background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(
                        R.color.change_bg_color));
            }
        });

        // Change the text to user entered text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String display_text = ((EditText) findViewById(R.id.userText)).getText().toString();
                if (TextUtils.isEmpty(display_text)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Prabin!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(display_text);
                }
            }
        });

        // Restore everything back to default
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the text color to white
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor
                        (R.color.white));
                // Change the background color to the default background color
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(
                        R.color.bg_color));
                // Change the text to default text
                ((TextView) findViewById(R.id.textView)).setText("Hello from Prabin!");
            }
        });
    }
}

package com.example.kudas42ipzlab02;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView smotrite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        smotrite = findViewById(R.id.textView);
        String namir2 = getIntent().getStringExtra("Message");
        smotrite.setText(namir2);
    }
}

package com.example.kudas42ipzlab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void SendMessage(View view) {
        //Intent namir = new Intent(this, Main2Activity.class);
        Intent namir = new Intent(Intent.ACTION_SEND);
        namir.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
        namir.setType("text/plane");
        startActivity(namir);
    }
}

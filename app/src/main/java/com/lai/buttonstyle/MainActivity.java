package com.lai.buttonstyle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lai.library.ButtonStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonStyle mButtonStyle = (ButtonStyle) findViewById(R.id.buttonStyle);
        //mButtonStyle.setNormalColor(R.color.logo_color);
        //mButtonStyle.setPressedColor(R.color.colorAccent);
    }

}

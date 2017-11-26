package com.casianporter.practice3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void ClickOnFunction (View Button){

        EditText UserInput1 = (EditText) findViewById(R.id.UserInput1);


        Toast.makeText(MainActivity.this, "Hello " + UserInput1.getText().toString(), Toast.LENGTH_SHORT).show();

        /*
         Toast.makeText( CONTEXT , MESSAGE , TIME).show();

         Code to create a short message to appear at the bottom of the screen

         CONTEXT  = where you want the text to appear Ex: MainActivity.this -> Makes it appear in MainActivity Screen

         MESSAGE = text you want the Toast to show

         TIME = time you want the toast to appear Ex: Toast.LENGTH_LONG OR .LENGTH_SHORT

         .show() is the function for the toast to appear on the screen

         */

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

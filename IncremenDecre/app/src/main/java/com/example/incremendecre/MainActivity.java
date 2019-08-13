package com.example.incremendecre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Ebutton1;
    Button Dbutton2;
    TextView TextView1;
    int count = 0;
    int tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //connecting page xml file

        TextView1 = findViewById(R.id.text1); //findviewbyid writen because of set the data on textview.
      /*  Ebutton1 = findViewById(R.id.Increment);
        Dbutton2 = findViewById(R.id.Decrement);*/
        TextView1.setText("0");    //on app launch TextView will show zero
    }


    public void increment(View view) {    //increments
        count += +1;
        TextView1.setText(String.valueOf(count) + "");   //set the value in the textview.

    }

    public void decrement(View view) {   //Decrement
        count -= 1;
        TextView1.setText(String.valueOf(count));
    }
}

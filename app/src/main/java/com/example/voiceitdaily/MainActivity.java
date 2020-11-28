package com.example.voiceitdaily;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private TextView dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting date in the textview

        dateTimeDisplay = (TextView)findViewById(R.id.todays_date);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("E, MMM d, ''yy");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);


    }
}
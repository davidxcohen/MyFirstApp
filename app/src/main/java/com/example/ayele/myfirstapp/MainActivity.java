package com.example.ayele.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//import java.util.Calendar;
//import java.util.Date;
//import java.util.Locale;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view){
        //Toast myToast = Toast.makeText(this, message, duration);
        /*
        public String weekdays[] = new DateFormatSymbols(Locale.ITALIAN).getWeekdays();
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        */
        Toast myToast = Toast.makeText(this, "Saturday", Toast.LENGTH_SHORT);
        myToast.show();
    }
//    public void showAnswer(View view) {
//        TextView answerTextView = (TextView) findViewById(R.id.show_me_answer);
//        answerTextView.setText .answerTextView("Today is Saturday");
//    }

    public void countMe (View view) {
        // Get the text view.
        // TextView showCountTextView = (TextView)findViewById(R.id.show_count);
        TextView showCountTextView = findViewById(R.id.show_count);
        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it.
        Integer count = Integer.parseInt(countString);
        count++;

        // Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }
    public void randomMe(View view)
    {
        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView showCountTextView = findViewById(R.id.show_count);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT, count);

        // Start the new activity.
        startActivity(randomIntent);
    }

}

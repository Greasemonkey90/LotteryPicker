package com.bunny.android.lotterypicker;



import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
    ArrayList<Integer> theList;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    private TextView theDAY;
    private TextView theTIME;

    String gameDays;
    String gameTimes;
    Integer getGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theDAY = findViewById(R.id.dayField);
        theTIME = findViewById(R.id.timeField);
        loadActivity();

        adapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.game_choices,R.layout.spinner_style);
        spinner= findViewById(R.id.whichGame);
        adapter.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent,View view, int position,long id){

    }

    public void onNothingSelected(AdapterView<?> arg){

    }
    public void loadActivity(){
        TextView showNumber1 = findViewById(R.id.whereNumberShows1);
        showNumber1.setVisibility(View.GONE);
        TextView showNumber2 = findViewById(R.id.whereNumberShows2);
        showNumber2.setVisibility(View.GONE);
        TextView showNumber3 = findViewById(R.id.whereNumberShows3);
        showNumber3.setVisibility(View.GONE);
        TextView showNumber4 = findViewById(R.id.whereNumberShows4);
        showNumber4.setVisibility(View.GONE);
        TextView showNumber5 = findViewById(R.id.whereNumberShows5);
        showNumber5.setVisibility(View.GONE);
        TextView showNumber6 = findViewById(R.id.whereNumberShows6);
        showNumber6.setVisibility(View.GONE);
        TextView lastBankBall = findViewById(R.id.lastBankBall);
        lastBankBall.setVisibility(View.GONE);
    }

    public void displayDaysAndTimes(){
        StringBuilder forDays = new StringBuilder();
        forDays.append(getString(R.string.drawDays));
        forDays.append(gameDays);
        theDAY.setText(forDays);
        theDAY.setTextColor(Color.RED);
        theDAY.setTextSize(18);
        StringBuilder forTimes = new StringBuilder();
        forTimes.append(getString(R.string.drawTimes));
        forTimes.append(gameTimes);
        theTIME.setText(forTimes);
        theTIME.setTextColor(Color.RED);
        theTIME.setTextSize(18);
    }
    public Integer whichGame() {
        loadActivity();
         getGame = spinner.getSelectedItemPosition();

        return getGame;
    }

    public void ClickButton(View view) {
        displayList();
        displayDaysAndTimes();
        theList = null;
        theList = new gameNumbers();
        getGame = null;
    }

    public void showFirstThree(){
        TextView showNumber1 = findViewById(R.id.whereNumberShows1);
        TextView showNumber2 = findViewById(R.id.whereNumberShows2);
        TextView showNumber3 = findViewById(R.id.whereNumberShows3);
        int firstNumber = theList.get(0);
        showNumber1.setText(String.valueOf(firstNumber));
        showNumber1.setVisibility(View.VISIBLE);
        int secondNumber = theList.get(1);
        showNumber2.setText(String.valueOf(secondNumber));
        showNumber2.setVisibility(View.VISIBLE);
        int thirdNumber = theList.get(2);
        showNumber3.setText(String.valueOf(thirdNumber));
        showNumber3.setVisibility(View.VISIBLE);
    }

    public void displayList() {
        TextView showNumber4 = findViewById(R.id.whereNumberShows4);
        TextView showNumber5 = findViewById(R.id.whereNumberShows5);
        TextView showNumber6 = findViewById(R.id.whereNumberShows6);
        TextView showBankLast = findViewById(R.id.lastBankBall);
        whichGame();
        if(getGame == 0){
            theTIME.setVisibility(View.GONE);
            theDAY.setVisibility(View.GONE);
            Toast.makeText(this,"Please select a game to continue",
                    Toast.LENGTH_LONG).show();
        } else if (getGame == 1) {
            theList = new gameNumbers().setPick3();
            showFirstThree();
            gameDays = "Everyday";
            gameTimes = "1:59 PM and 11:00 PM";


        }else if (getGame == 2) {
            theList = new gameNumbers().setPick4();
            showFirstThree();
            gameDays = "Everyday";
            gameTimes = "1:59 PM and 11:00 PM";
            int fourthNumber = theList.get(3);
            showNumber4.setText(String.valueOf(fourthNumber));
            showNumber4.setVisibility(View.VISIBLE);

        }else if (getGame == 3) {
            theList = new gameNumbers().setCash5();
            showFirstThree();
            gameDays = "Everyday";
            gameTimes = "1:59 PM and 11:00 PM";
            int fourthNumber = theList.get(3);
            showNumber4.setText(String.valueOf(fourthNumber));
            showNumber4.setVisibility(View.VISIBLE);
            int fifthNumber = theList.get(4);
            showNumber5.setText(String.valueOf(fifthNumber));
            showNumber5.setVisibility(View.VISIBLE);

        }else if(getGame == 4) {
            theList = new gameNumbers().setPowerBall();
            showFirstThree();
            gameDays = "Wednesday and Saturday";
            gameTimes = "11:00 PM";
            int fourthNumber = theList.get(3);
            showNumber4.setText(String.valueOf(fourthNumber));
            showNumber4.setVisibility(View.VISIBLE);
            int fifthNumber = theList.get(4);
            showNumber5.setText(String.valueOf(fifthNumber));
            showNumber5.setVisibility(View.VISIBLE);
            int sixthNumber = theList.get(5);
            showNumber6.setText(String.valueOf(sixthNumber));
            showNumber6.setVisibility(View.VISIBLE);
        }else if(getGame==5){
            theList = new gameNumbers().setMegaMillion();
            showFirstThree();
            gameDays = "Tuesday and Friday";
            gameTimes = "11:00 PM";
            int fourthNumber = theList.get(3);
            showNumber4.setText(String.valueOf(fourthNumber));
            showNumber4.setVisibility(View.VISIBLE);
            int fifthNumber = theList.get(4);
            showNumber5.setText(String.valueOf(fifthNumber));
            showNumber5.setVisibility(View.VISIBLE);
            int sixthNumber = theList.get(5);
            showNumber6.setText(String.valueOf(sixthNumber));
            showNumber6.setVisibility(View.VISIBLE);
        }else if(getGame==6){
            theList = new gameNumbers().setCash4Life();
            showFirstThree();
            gameDays = "Monday and Thursday";
            gameTimes = "9:00 PM";
            int fourthNumber = theList.get(3);
            showNumber4.setText(String.valueOf(fourthNumber));
            showNumber4.setVisibility(View.VISIBLE);
            int fifthNumber = theList.get(4);
            showNumber5.setText(String.valueOf(fifthNumber));
            showNumber5.setVisibility(View.VISIBLE);
            int sixthNumber = theList.get(5);
            showNumber6.setText(String.valueOf(sixthNumber));
            showNumber6.setVisibility(View.VISIBLE);
        }else if(getGame==7){
            theList = new gameNumbers().setBankAmillion();
            showFirstThree();
            gameDays = "Wednesday and Saturday";
            gameTimes = "11:00 PM";
            int fourthNumber = theList.get(3);
            showNumber4.setText(String.valueOf(fourthNumber));
            showNumber4.setVisibility(View.VISIBLE);
            int fifthNumber = theList.get(4);
            showNumber5.setText(String.valueOf(fifthNumber));
            showNumber5.setVisibility(View.VISIBLE);
            int sixthNumber = theList.get(5);
            showBankLast.setText(String.valueOf(sixthNumber));
            showBankLast.setVisibility(View.VISIBLE);
        }
    }

}

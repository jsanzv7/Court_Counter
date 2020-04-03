package com.example.android.courtcounter;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * *Increase the score for Team A by 3 point.
     */
    public void addThreeForTeamA(View v)  {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * *Increase the score for Team A by 2 point.
     */
    public void addTTwoForTeamA(View v)  {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * *Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v)  {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * *Increase the score for Team B by 3 point.
     */
    public void addThreeForTeamB(View v)  {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * *Increase the score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v)  {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * *Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v)  {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * *Increase the score for Team B by 1 point.
     */
    public void resetScore(View v)  {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(score));
    }


}





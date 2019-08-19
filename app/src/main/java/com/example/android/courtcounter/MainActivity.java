package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    public static final int THREE_POINT_THROW = 3;
    public static final int TWO_POINTS_THROW = 2;
    public static final int FREE_THROW = 1;
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    /**
     * Display the given score for team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    
    public void addThreeTeamA(View view) {
        scoreTeamA = scoreTeamA + THREE_POINT_THROW;
        displayForTeamA(scoreTeamA);
    }
    
    
    public void addTwoTeamA(View view) {
        scoreTeamA = scoreTeamA + TWO_POINTS_THROW;
        displayForTeamA(scoreTeamA);
    }
    
    public void addOneTeamA(View view) {
        scoreTeamA = scoreTeamA + FREE_THROW;
        displayForTeamA(scoreTeamA);
    }
    
    /**
     * Display the given score for team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    
    public void addThreeTeamB(View view) {
        scoreTeamB = scoreTeamB + THREE_POINT_THROW;
        displayForTeamB(scoreTeamB);
    }
    
    
    public void addTwoTeamB(View view) {
            scoreTeamB = scoreTeamB + TWO_POINTS_THROW;
            displayForTeamB(scoreTeamB);
    }
    
    public void addOneTeamB(View view) {
        scoreTeamB = scoreTeamB + FREE_THROW;
        displayForTeamB(scoreTeamB);
    }
    
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    
    /*
    Reset button handler.
     */
    
    
}
package com.example.android.cricketscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.cricketscore.R.id.teamAExtraRuns;
import static com.example.android.cricketscore.R.id.teamAFours;
import static com.example.android.cricketscore.R.id.teamASixes;
import static com.example.android.cricketscore.R.id.teamAWickets;
import static com.example.android.cricketscore.R.id.teamBExtraRuns;
import static com.example.android.cricketscore.R.id.teamBFours;
import static com.example.android.cricketscore.R.id.teamBSixes;
import static com.example.android.cricketscore.R.id.teamBWickets;

public class MainActivity extends AppCompatActivity {

    int runsTeamA = 0;
    int sixesTeamA = 0;
    int foursTeamA = 0;
    int extrasTeamA = 0;
    int wicketsTeamA = 0;
    int runsTeamB = 0;
    int sixesTeamB = 0;
    int foursTeamB = 0;
    int wicketsTeamB = 0;
    int extrasTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the runs for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        runsTeamA = runsTeamA + 1;
        displayForTeamA(runsTeamA);
    }

    /**
     * Counts the number of Wickets/ Outs.
     */
    public void addWicketsTeamA(View v) {
        wicketsTeamA = wicketsTeamA + 1;
        displayWicketsTeamA(wicketsTeamA);
    }

    /**
     * Increase the runs for Team A by 6 point.
     * Counts the number of Sixes.
     */
    public void addSixForTeamA(View v) {
        runsTeamA = runsTeamA + 6;
        displayForTeamA(runsTeamA);
        sixesTeamA = sixesTeamA + 1;
        displaySixesTeamA(sixesTeamA);
    }

    /**
     * Increase the runs for Team A by 4 point.
     * Counts the number of Fours.
     */
    public void addFourForTeamA(View v) {
        runsTeamA = runsTeamA + 4;
        displayForTeamA(runsTeamA);
        foursTeamA = foursTeamA + 1;
        displayFoursTeamA(foursTeamA);
    }

    /**
     * Increase the runs for Team A by 1 extra point.
     * Counts the number of Extra Points.
     */
    public void addExtraForTeamA(View v) {
        runsTeamA = runsTeamA + 1;
        displayForTeamA(runsTeamA);
        extrasTeamA = extrasTeamA + 1;
        displayExtraRunsTeamA(extrasTeamA);
    }


    /**
     * Team A Total runs Display.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamARuns);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team A Sixes Display.
     */

    public void displaySixesTeamA(int score) {
        TextView scoreView = (TextView) findViewById(teamASixes);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team A Fours Display.
     */

    public void displayFoursTeamA(int score) {
        TextView scoreView = (TextView) findViewById(teamAFours);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team A Extra Runs Display.
     */

    public void displayExtraRunsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(teamAExtraRuns);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team A Outs/ Wikets Display.
     */
    public void displayWicketsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(teamAWickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the runs for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        runsTeamB = runsTeamB + 1;
        displayForTeamB(runsTeamB);
    }

    /**
     * Counts the number of Wickets/ Outs.
     */
    public void addWicketsTeamB(View v) {
        wicketsTeamB = wicketsTeamB + 1;
        displayWicketsTeamB(wicketsTeamB);
    }

    /**
     * Increase the runs for Team B by 6 point.
     * Counts the number of Sixes.
     */
    public void addSixForTeamB(View v) {
        runsTeamB = runsTeamB + 6;
        displayForTeamB(runsTeamB);
        sixesTeamB = sixesTeamB + 1;
        displaySixesTeamB(sixesTeamB);
    }

    /**
     * Increase the runs for Team B by 4 point.
     * Counts the number of Fours.
     */
    public void addFourForTeamB(View v) {
        runsTeamB = runsTeamB + 4;
        displayForTeamB(runsTeamB);
        foursTeamB = foursTeamB + 1;
        displayFoursTeamB(foursTeamB);
    }

    /**
     * Increase the runs for Team B by 1 extra point.
     * Counts the number of Extra Points.
     */
    public void addExtraForTeamB(View v) {
        runsTeamB = runsTeamB + 1;
        displayForTeamB(runsTeamB);
        extrasTeamB = extrasTeamB + 1;
        displayExtraRunsTeamB(extrasTeamB);
    }


    /**
     * Team B Total runs Display.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBRuns);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B Sixes Display.
     */

    public void displaySixesTeamB(int score) {
        TextView scoreView = (TextView) findViewById(teamBSixes);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B Fours Display.
     */

    public void displayFoursTeamB(int score) {
        TextView scoreView = (TextView) findViewById(teamBFours);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B Extra Runs Display.
     */

    public void displayExtraRunsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(teamBExtraRuns);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B Outs/ Wikets Display.
     */
    public void displayWicketsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(teamBWickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resetting both Team A and Team B Displays!.
     */

    public void resetScore(View v) {
        runsTeamA = 0;
        sixesTeamA = 0;
        foursTeamA = 0;
        extrasTeamA = 0;
        wicketsTeamA = 0;
        runsTeamB = 0;
        sixesTeamB = 0;
        foursTeamB = 0;
        extrasTeamB = 0;
        wicketsTeamB = 0;

        displayForTeamA(runsTeamA);
        displayForTeamB(runsTeamB);
        displayWicketsTeamA(wicketsTeamA);
        displayWicketsTeamB(wicketsTeamB);
        displaySixesTeamA(sixesTeamA);
        displaySixesTeamB(sixesTeamB);
        displayFoursTeamA(foursTeamA);
        displayFoursTeamB(foursTeamB);
        displayExtraRunsTeamA(extrasTeamA);
        displayExtraRunsTeamB(extrasTeamB);
    }
}

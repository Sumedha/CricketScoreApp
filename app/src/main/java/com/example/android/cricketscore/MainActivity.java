package com.example.android.cricketscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.cricketscore.R.id.teamAExtraRuns;
import static com.example.android.cricketscore.R.id.teamAFours;
import static com.example.android.cricketscore.R.id.teamASixes;
import static com.example.android.cricketscore.R.id.teamAWickets;

public class MainActivity extends AppCompatActivity {

    int runsTeamA = 0;
    int sixesTeamA = 0;
    int foursTeamA = 0;
    int extrasTeamA = 0;
    int wicketsTeamA = 0;

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
    public void addWicketsTeamA (View v) {
        wicketsTeamA = wicketsTeamA + 1;
        displayWicketsTeamA (wicketsTeamA);
    }

    /**
     * Increase the runs for Team A by 6 point.
     * Counts the number of Sixes.
     */
    public void addSixForTeamA(View v) {
        runsTeamA = runsTeamA + 6;
        displayForTeamA(runsTeamA);
        sixesTeamA = sixesTeamA + 1;
        displaySixesTeamA (sixesTeamA);
    }

    /**
     * Increase the runs for Team A by 4 point.
     * Counts the number of Fours.
     */
    public void addFourForTeamA(View v) {
        runsTeamA = runsTeamA + 4;
        displayForTeamA(runsTeamA);
        foursTeamA = foursTeamA +1;
        displayFoursTeamA(foursTeamA);
    }

    /**
     * Increase the runs for Team A by 1 extra point.
     * Counts the number of Extra Points.
     */
    public void addExtraForTeamA(View v) {
        runsTeamA = runsTeamA + 1;
        displayForTeamA(runsTeamA);
        extrasTeamA = extrasTeamA +1;
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
}

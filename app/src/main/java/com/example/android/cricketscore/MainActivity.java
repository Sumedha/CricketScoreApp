package com.example.android.cricketscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runsTeamA = 0;

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
     * Increase the runs for Team A by 6 point.
     */
    public void addSixForTeamA(View v) {
        runsTeamA = runsTeamA + 6;
        displayForTeamA(runsTeamA);
    }

    /**
     * Increase the runs for Team A by 4 point.
     */
    public void addFourForTeamA(View v) {
        runsTeamA = runsTeamA + 4;
        displayForTeamA(runsTeamA);
    }

    /**
     * Increase the runs for Team A by 1 extra point.
     */
    public void addExtraForTeamA(View v) {
        runsTeamA = runsTeamA + 1;
        displayForTeamA(runsTeamA);
    }

    /**
     * Team A runs Display.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamARuns);
        scoreView.setText(String.valueOf(score));
    }
}

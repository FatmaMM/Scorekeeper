package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int ScoreTeamA=0;
    int ScoreTeamB=0;
    public void add_six_points_for_team_A(View view) {
        ScoreTeamA+=6;
        displayforteamA(ScoreTeamA);
    }
    public void add_Three_points_for_team_A(View view) {
        ScoreTeamA+=3;
        displayforteamA(ScoreTeamA);
    }

    public void add_Two_Points_for_team_A(View view)
    {ScoreTeamA+=2;
        displayforteamA(ScoreTeamA);
    }

    public void add_one_point_for_team_A(View view) {
        ScoreTeamA+=1;
        displayforteamA(ScoreTeamA);

    }
    public void displayforteamA(int val){
        TextView score=(TextView)findViewById(R.id.team_a_score);
        score.setText(String.valueOf(val));
    }
    public void displayforteamB(int val){
        TextView score=(TextView)findViewById(R.id.team_b_score);
        score.setText(String.valueOf(val));
    }

    public void add_one_point_for_team_B(View view) {
        ScoreTeamB+=1;
        displayforteamB(ScoreTeamB);
    }

    public void add_Two_Points_for_team_B(View view) {
        ScoreTeamB+=2;
        displayforteamB(ScoreTeamB);
    }

    public void add_Three_points_for_team_B(View view) {
        ScoreTeamB+=3;
        displayforteamB(ScoreTeamB);
    }

    public void add_six_points_for_team_B(View view) {
        ScoreTeamB+=6;
        displayforteamB(ScoreTeamB);
    }

    public void zeroPoints(View view) {
        ScoreTeamA=0;
        ScoreTeamB=0;
        displayforteamA(ScoreTeamA);
        displayforteamB(ScoreTeamB);
    }
}

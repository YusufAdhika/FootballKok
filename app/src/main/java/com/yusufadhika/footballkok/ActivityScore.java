package com.yusufadhika.footballkok;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityScore extends AppCompatActivity {
    int scoreTeamA, scoreTeamB = 0;
    private String title = "   Soccer Score";

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        setActionBar(title);
    }

    private void setActionBar(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    public void displayForTeamA(int score) {
        android.widget.TextView scoreView = (android.widget.TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void satuPointA(android.view.View view) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);

    }

    public void displayForTeamB(int score) {
        android.widget.TextView scoreView = (android.widget.TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void satuPointB(android.view.View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    public void resetPoint(android.view.View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

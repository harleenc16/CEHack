package com.example.bytesizec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DataQuiz extends AppCompatActivity {
    private Question2 mQuestionLibrary = new Question2();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button quitButton;
    private String mAnswer;
    private int mScore= 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView= (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        quitButton = (Button) findViewById(R.id.quit);

        updateQuestion();
        //Start of Button Listener for Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(DataQuiz.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(DataQuiz.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //Start of Button Listener for Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(DataQuiz.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(DataQuiz.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //Start of Button Listener for Button 1
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(DataQuiz.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(DataQuiz.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //Quit Button
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataQuiz.this, DataVideo.class);
                startActivity(intent);
            }
        });
    }

    private void updateQuestion(){
        if (mQuestionNumber >=4){
            ((ScoresClass) DataQuiz.this.getApplication()).setData_types_score(mScore);
            Intent intent = new Intent(DataQuiz.this, LecturesMenu.class);
            startActivity(intent);
        } else {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
    }


    private void updateScore(int point) {
        mScoreView.setText(""+mScore);
    }
}

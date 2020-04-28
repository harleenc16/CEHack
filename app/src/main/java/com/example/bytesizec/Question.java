package com.example.bytesizec;

public class Question {
    private String mQuestions [] ={

            "Strings are a(n) _______ type that represents sequences of characters.",

            "In the code below, select the right answer that would return the factorial of a number",

            "What condition do you need in a factorial function to avoid stack overflow?",

            "Which header do need to include when you have a file in your program",


    };


    private String mChoices [] []={
            {"Object", "Data", "C++"},
            {"n*fact", "n*fact(n-1)", "fact(n-1)"},
            {"Stop", "If", "While",},
            {"#include<stdlib.h>", "#include<fstream>", "#include<math.h>"}


    };

    private String mCorrectAnswers[]={"Object", "n*fact(n-1)", "Stop", "#include<fstream>"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){

        String choice1= mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){

        String choice2= mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int b){
        String answer = mCorrectAnswers[b];
        return answer;
    }

}
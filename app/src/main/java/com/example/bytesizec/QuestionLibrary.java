package com.example.bytesizec;

public class QuestionLibrary {
    private String mQuestions [] = {
            "What does a pointer store?",
            "Which of the following correctly dereferences a pointer?",
            "How can you change the value of the variable a to 5 using a pointer?",
            "Which of the following set the value of variable a to the value of variable b?"
    };
    private String mChoices [] []= {
            {"The address of the variable it points to", "The value of the variable it points to", "The address of the program in which it is declared"},
            {"pointer", "pointer*", "*pointer"},
            {"int* pointer = &a ; pointer = 5;", "int* pointer = &a ; *pointer = 5;", "int *pointer = 5; int pointer = &a"},
            {"int* pointer = &a ; pointer = b;","int* pointer = &a ; *pointer = &b;", "int* pointer = &a ; *pointer = b;"}
    };

    private String mCorrectAnswers []=
            {"The address of the variable it points to",  "*pointer" , "int* pointer = &a ; *pointer = 5;","int* pointer = &a ; *pointer = b;"};

    public String getQuestion (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2 (int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

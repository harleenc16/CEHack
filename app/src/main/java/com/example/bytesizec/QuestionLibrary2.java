package com.example.bytesizec;

public class QuestionLibrary2 {
    private String mQuestions[] = {
            "Choose the correct answer for following function prototype: void func(int a,int &b);",
            "What is the return type of the following function: int func(int a, int b)",
            "Which statement is correct about passing the parameter as a value?",
            "What of the following is not found in the stack frame of a function?"
    };
    private String mChoices[][] = {
            {"a is pass by value and b is pass by reference", "a is pass by reference and b is pass by value", "a is pass by value and b is pass by address", "a is pass by value and b is pass by pointer"},
            {"void", "int", "char"},
            {"It can change the actual parameter value", "It cannot change the actual parameter value", "Parameters is always in read-write mode", "None"},
            {"Parameters", "Return Address", "Code for function", "Local Variables"}
    };

    private String mCorrectAnswers[] = {"a is pass by value and b is pass by reference", "int", "It cannot change the actual parameter value", "Code for function"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

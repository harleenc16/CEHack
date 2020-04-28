package com.example.bytesizec;

import android.app.Application;


public class ScoresClass extends Application {
    public int data_types_score = 0;
    public int functs_score = 0;
    public int pass_by_score = 0;
    public int inout_score = 0;
    public int pointers_score;

   public int getFuncts_score() {
        return functs_score;
    }

    public void setFuncts_score(int functs_score) {
        this.functs_score = functs_score;
    }

    public int getData_types_score() {
        return data_types_score;
    }

    public void setData_types_score(int data_types_score) {
               this.data_types_score = data_types_score;
    }

    public int getPass_by_score() {
                return pass_by_score;
    }

    public void setPass_by_score(int pass_by_score) {
          this.pass_by_score = pass_by_score;
    }

    public int getInout_score() {
        return inout_score;
    }

    public void setInout_score(int inout_score) {
        this.inout_score = inout_score;
    }

    public int getPointers_score() {
        return pointers_score;
    }

    public void setPointers_score(int pointers_score) {
        this.pointers_score = pointers_score;
    }
}

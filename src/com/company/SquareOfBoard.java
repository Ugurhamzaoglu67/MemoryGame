package com.company;

public class SquareOfBoard {

    private char currentValue;
    private boolean myPredict = false;


    public SquareOfBoard(char currentValue) {
        this.currentValue = currentValue;
    }

    public char getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(char currentValue) {
        this.currentValue = currentValue;
    }

    public boolean isMyPredict() {
        return myPredict;
    }

    public void setMyPredict(boolean myPredict) {
        this.myPredict = myPredict;
    }
}

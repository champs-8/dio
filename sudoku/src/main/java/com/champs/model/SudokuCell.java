package com.champs.model;

/**
* @author fabio santos
* @version 1.0
* SudokuCell.java
*/

public class SudokuCell {
    private int value;
    private final boolean isFixed;

    public SudokuCell(int value, boolean isFixed) {
        this.value = value;
        this.isFixed = isFixed;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        if(!isFixed){
            this.value = value;
        }
    }
    public boolean isFixed() {
        return isFixed;
    }
}

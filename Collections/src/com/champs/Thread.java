package com.champs;

public class Thread {
    private String description;

    //constructor
    public Thread(String description) {
        this.description = description;
    }

    //getter e setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //toString

    @Override
    public String toString() {
        return description;
    }
}

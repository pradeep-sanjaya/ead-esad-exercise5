package com.sliit;

public class UndergraduateStudent extends AbstratStudent {

    public UndergraduateStudent() {
        setProgram(new BScProgram());
        setFestival(new CodeFest());
    }

    @Override
    public void offerPrograms() {
        getProgram().offerPrograms();
    }

    @Override
    public void performEvent() {
        getFestival().performEvent();
    }

    @Override
    public void displayStudents() {
        System.out.println("Display under graduate students");
    }
}

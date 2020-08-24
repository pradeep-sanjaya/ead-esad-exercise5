package com.sliit;

public class PostGraduateStudent extends AbstratStudent {

    public PostGraduateStudent() {
        setProgram(new DoctoralProgram());
        setFestival(new RoboFest());
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
        System.out.println("Display PostGraduate Students");
    }
}

package com.sliit;

public abstract class AbstratStudent implements Student, Festival, Program {

    private Festival festival;
    private Program program;

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void offerPrograms() {
        program.offerPrograms();
    }

    public void performEvent() {
        festival.performEvent();
    }

    @Override
    public void displayStudents() {
        System.out.println("Display Students");
    }
}

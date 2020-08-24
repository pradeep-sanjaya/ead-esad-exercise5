package com.sliit;

public class StratergyDemo {
    public static void main(String[] args) {
        AbstratStudent pgStudent = new PostGraduateStudent();
        pgStudent.offerPrograms();
        pgStudent.performEvent();
        pgStudent.displayStudents();

        System.out.println("\n===== Assign new event =====");
        pgStudent.setFestival(new CodeFest());
        pgStudent.performEvent();

        System.out.println("\n============================");

        AbstratStudent ugStudent = new UndergraduateStudent();
        ugStudent.offerPrograms();
        ugStudent.performEvent();
        ugStudent.displayStudents();

        System.out.println("\n===== Assign new program =====");
        ugStudent.setProgram(new MScProgram());
        ugStudent.offerPrograms();
    }
}

package models;

public class Cohort {

    private String nameOfCohort;
    private int noOfStudents;
    private String technicalMentor;

    public Cohort(String nameOfCohort, int noOfStudent, String technicalMentor) {
        this.nameOfCohort = nameOfCohort;
        this.noOfStudents = noOfStudent;
        this.technicalMentor = technicalMentor;
    }

    public String getNameOfCohort() {
        return nameOfCohort;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String getTechnicalMentor() {
        return technicalMentor;
    }
}

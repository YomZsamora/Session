package models;

public class Students {

    private int id;
    private String studentName;
    private String track;
    private String highSchool;
    private int age;
    private String studentDescription;
    private String kyuLevel;
    private int completedKatas;


    public Students(String studentName, String track, String highSchool, int age, String studentDescription, String kyuLevel, int completedKatas){
        this.studentName = studentName;
        this.track = track;
        this.highSchool = highSchool;
        this.age = age;
        this.studentDescription = studentDescription;
        this.kyuLevel = kyuLevel;
        this.completedKatas = completedKatas;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTrack() {
        return track;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public int getAge() {
        return age;
    }

    public String getStudentDescription() {
        return studentDescription;
    }

    public String getKyuLevel() {
        return kyuLevel;
    }

    public int getCompletedKatas() {
        return completedKatas;
    }
}

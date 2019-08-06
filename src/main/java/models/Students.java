package models;

public class Students {

    private int id;
    private String student_name;
    private String track;
    private String highschool;
    private int age;
    private String description;
    private int kyu_level;
    private int katas_completed;


    public Students(String student_name, String track, String highschool, int age, String description, int kyu_level, int katas_completed){
        this.student_name = student_name;
        this.track = track;
        this.highschool = highschool;
        this.age = age;
        this.description = description;
        this.kyu_level = kyu_level;
        this.katas_completed = katas_completed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return student_name;
    }

    public String getTrack() {
        return track;
    }

    public String getHighSchool() {
        return highschool;
    }

    public int getAge() {
        return age;
    }

    public String getStudentDescription() {
        return description;
    }

    public int getKyuLevel() {
        return kyu_level;
    }

    public int getCompletedKatas() {
        return katas_completed;
    }
}

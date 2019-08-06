package dao;

import models.Students;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oStudentsDao implements StudentsDao {
    private final Sql2o sql2o;

    public Sql2oStudentsDao(Sql2o sql2o){
        this.sql2o = sql2o; //making the sql2o object available everywhere so we can call methods in it
    }


    @Override
    public List<Students> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM students") //raw sql
                    .executeAndFetch(Students.class); //fetch a list
        }
    }

//    @Override
//    public void add(Students student) {
//        String sql = "INSERT INTO students (student_name, track, highschool, age, description, kyu_level, katas_completed) VALUES (:student_name, :track, :highschool, :age, :description, :kyu_level, :katas_completed)"; //raw sql
//        try(Connection con = sql2o.open()){ //try to open a connection
//            int id = (int) con.createQuery(sql, true) //make a new variable
//                    .bind(student) //map my argument onto the query so we can use information from it
//                    .executeUpdate() //run it all
//                    .getKey(); //int id is now the row number (row “key”) of db
//            student.setId(id); //update object to set id now from database
//        } catch (Sql2oException ex) {
//            System.out.println(ex); //oops we have an error!
//        }
//    }
        @Override
        public void add(Students student) {
            String sql = "INSERT INTO students (student_name, track, highschool, age, description, kyu_level, katas_completed) VALUES (:student_name, :track, :highschool, :age, :description, :kyu_level, :katas_completed)"; //raw sql
            try(Connection con = sql2o.open()){ //try to open a connection
                int id = (int) con.createQuery(sql, true)
                        .addParameter("student_name", student.getStudentName())
                        .addParameter("track", student.getTrack())
                        .addParameter("highschool",student.getHighSchool())
                        .addParameter("age", student.getAge())
                        .addParameter("description", student.getStudentDescription())
                        .addParameter("kyu_level", student.getKyuLevel())
                        .addParameter("katas_completed",student.getCompletedKatas())
                        .executeUpdate() //run it all
                        .getKey(); //int id is now the row number (row “key”) of db
                        student.setId(id); //update object to set id now from database
            } catch (Sql2oException ex) {
                    System.out.println(ex); //oops we have an error!
            }
        }

    @Override
    public Students findById(int id) {
        return null;
    }
}

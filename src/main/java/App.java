import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dao.Sql2oStudentsDao;

import models.Students;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        String connectionString = "jdbc:h2:~/moringa_school.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        Sql2oStudentsDao studentsDao = new Sql2oStudentsDao(sql2o);

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            List<Students> students = studentsDao.getAll();
//            model.put("students", students);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/view_students", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            List<Students> students = studentsDao.getAll();
//            for (Students student : students){
//                System.out.println(student.getStudentName());
//            }
            model.put("students", studentsDao.getAll());
            return new ModelAndView(model, "Students.hbs");
        }, new HandlebarsTemplateEngine());

        post("/addStudent", (req, res) -> { //URL to make new task on POST route
            Map<String, Object> model = new HashMap<>();
            String student_name = req.queryParams("student_name");
            String highschool = req.queryParams("highschool");
            int age = Integer.parseInt(req.queryParams("student_age"));
            int kyu_level = Integer.parseInt(req.queryParams("kyu_level"));
            int katas_completed = Integer.parseInt(req.queryParams("katas_completed"));
            String track = req.queryParams("track");
            String description = req.queryParams("description");
            Students newStudent = new Students(student_name, track, highschool, age, description, kyu_level, katas_completed);
            studentsDao.add(newStudent);
            res.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

    }
}
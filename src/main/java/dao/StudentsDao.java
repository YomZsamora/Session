package dao;

import models.Students;

import java.util.List;

public interface StudentsDao {

    // LIST
    List<Students> getAll();

    // CREATE
    void add(Students task);

    // READ
    Students findById(int id);
}

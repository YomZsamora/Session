SET MODE PostgreSQL;


CREATE TABLE IF NOT EXISTS students (
  id int PRIMARY KEY auto_increment,
  student_name VARCHAR,
  track VARCHAR,
  highschool VARCHAR,
  age int,
  description VARCHAR,
  kyu_level int,
  katas_completed int
);
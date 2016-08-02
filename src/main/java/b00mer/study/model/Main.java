package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.SQLException;

public class Main {    
    
    public static void main(String[] args) throws SQLException {

    DatabaseConnector databaseConnector = new DatabaseConnector();
    
    /*databaseConnector.putQuery("insert into chief values ('ch000001', 'Ivanov', 'Ivan', 'Petrovich', 120000);");
    Chief chief = new Chief("select * from chief where chief_salary = 120000");
    System.out.println(chief.toString());    
    databaseConnector.putQuery("delete from chief where chief_id = 'ch000001';");
    
    databaseConnector.putQuery("insert into student values ('st0001', 'Petr', 'Petrov', 'Ivanovich', 'cl0001');");    
    Student student = new Student("select * from student where student_id = 'st0001';");    
    System.out.println(student.toString());    
    databaseConnector.putQuery("delete from student where student_id = 'st0001';");
    
    databaseConnector.putQuery("insert into course values ('co0001', 'Math', 120, 'ch0001');");    
    Course course = new Course("select * from course where course_id = 'co0001';");    
    System.out.println(course.toString());    
    databaseConnector.putQuery("delete from course where course_id = 'co0001';");*/
    
    databaseConnector.closeMySQLConnection();
    
    }
}
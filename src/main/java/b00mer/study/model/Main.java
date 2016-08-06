package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.SQLException;

public class Main {    
    
    public static void main(String[] args) throws SQLException {

    DatabaseConnector databaseConnector = new DatabaseConnector();
    
    /*
    databaseConnector.putQuery("insert into course values ('co0001', 'Math', 120, 'ch0001');");    
    Course course = new Course("select * from course where course_id = 'co0001';");    
    System.out.println(course.toString());    
    databaseConnector.putQuery("delete from course where course_id = 'co0001';");
    
    databaseConnector.putQuery("insert into class values ('cl0001', 'co0001', 'ch0001');");    
    Group group = new Group("select * from class where class_id = 'cl0001';");    
    System.out.println(group.toString());    
    databaseConnector.putQuery("delete from class where class_id = 'cl0001';");*/

    databaseConnector.closeMySQLConnection();
    
    }
}
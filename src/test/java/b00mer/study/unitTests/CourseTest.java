package b00mer.study.unitTests;

import b00mer.study.connector.DatabaseConnector;
import b00mer.study.model.Course;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;

public class CourseTest {

    DatabaseConnector databaseConnector;
    
    @Before
    public void setUp() throws SQLException {
    
        databaseConnector = new DatabaseConnector();
        
        databaseConnector.putQuery("delete from course where course_id = 'co000001';");
        databaseConnector.putQuery("insert into course values ('co000001', 'Math', 120, 'ch000001');");
    }

    public CourseTest() throws SQLException {
    
        Course course = new Course("select * from course where course_id = 'co_000001';");
        
        Assert.assertTrue(course.getCourseID().equals("co000001"));
        Assert.assertTrue(course.getCourseName().equals("Math"));
        Assert.assertTrue(course.getCourseChiefID().equals("ch000001"));
        Assert.assertTrue(course.getCourseLong() == 120);
    }
    
    @After
    public void tearDown() throws SQLException {
    
        databaseConnector.putQuery("delete from course where course_id = 'co000001';");
        databaseConnector.closeMySQLConnection();    
    }    
}
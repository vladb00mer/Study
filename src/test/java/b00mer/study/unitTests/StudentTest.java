package b00mer.study.unitTests;

import b00mer.study.connector.DatabaseConnector;
import b00mer.study.model.Student;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class StudentTest {
    
    DatabaseConnector databaseConnector;
        
    @Before
    public void setUp() throws SQLException {
    
        databaseConnector = new DatabaseConnector();

        databaseConnector.putQuery("delete from student where student_id = 'st000001';");
        databaseConnector.putQuery("insert into student values ('st000001', 'Petr', 'Petrov', 'Ivanovich', 'cl000001');");    
    }
    
    public StudentTest() throws SQLException {
        
        Student student = new Student("select * from student where student_id = 'st000001';");
        
        Assert.assertTrue(student.getStudentID().equals("st000001"));
        Assert.assertTrue(student.getStudentLastName().equals("Petrov"));
        Assert.assertTrue(student.getStudentName().equals("Petr"));
        Assert.assertTrue(student.getStudentMidName().equals("Ivanovich"));
        Assert.assertTrue(student.getStudentClass().equals("cl000001"));
    }
    
    @After
    public void tearDown() throws SQLException {
    
        databaseConnector.putQuery("delete from student where student_id = 'st000001';");
        databaseConnector.closeMySQLConnection();
    }
    
}
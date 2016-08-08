package b00mer.study.unitTests;

import b00mer.study.connector.DatabaseConnector;
import b00mer.study.model.Group;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupTest {
    
    DatabaseConnector databaseConnector;
    
    @Before
    public void setUp() throws SQLException {
    
        databaseConnector = new DatabaseConnector();
        
        databaseConnector.putQuery("delete from gruppa where group_id = 'gr000001';");
        databaseConnector.putQuery("insert into gruppa values ('gr000001', 'co000001', 'ch000001');");       
    }

    @Test
    public void test() throws SQLException {
    
        Group group = new Group("select * from gruppa where group_id = 'gr000001';");
        
        Assert.assertTrue(group.getGroupID().equals("gr000001"));
        Assert.assertTrue(group.getGroupChief().equals("ch000001"));
        Assert.assertTrue(group.getGroupCourses().contains("co000001"));
    }
    
    @After
    public void tearDown() throws SQLException {
    
        databaseConnector.putQuery("delete from gruppa where group_id = 'gr000001';");
        databaseConnector.closeMySQLConnection();
    }    
}
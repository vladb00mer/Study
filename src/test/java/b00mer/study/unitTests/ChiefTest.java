package b00mer.study.unitTests;

import b00mer.study.connector.DatabaseConnector;
import b00mer.study.model.Chief;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChiefTest {
    
    DatabaseConnector databaseConnector;
        
    @Before
    public void setUp() throws SQLException {
    
        databaseConnector = new DatabaseConnector();
        
        databaseConnector.putQuery("delete from chief where chief_id = 'ch000001';");
        databaseConnector.putQuery("insert into chief values ('ch000001', 'Ivanov', 'Ivan', 'Petrovich', 120000);");
    }
    
    @Test
    public void test() throws SQLException {
    
        Chief chief = new Chief("select * from chief where chief_id = 'ch000001';");

        Assert.assertTrue(chief.getChiefID().equals("ch000001"));
        Assert.assertTrue(chief.getChiefLastName().equals("Ivanov"));
        Assert.assertTrue(chief.getChiefName().equals("Ivan"));
        Assert.assertTrue(chief.getChiefMidName().equals("Petrovich"));    
        Assert.assertTrue(chief.getChiefSalary() == 120000);
    }
    
    @After
    public void tearDown() throws SQLException {
        
        databaseConnector.putQuery("delete from chief where chief_id = 'ch000001';");
        databaseConnector.closeMySQLConnection();
    }
}
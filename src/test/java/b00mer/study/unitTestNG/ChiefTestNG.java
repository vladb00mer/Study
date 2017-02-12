package b00mer.study.unitTestNG;

import b00mer.study.connector.DatabaseConnector;
import b00mer.study.model.Chief;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author root
 */

public class ChiefTestNG {
    
    static DatabaseConnector databaseConnector;
    static Chief chief;

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        databaseConnector = new DatabaseConnector();
        databaseConnector.putQuery("insert into chief values ('ch000001', 'Ivanov', 'Ivan', 'Petrovich', 120000);");
        
        chief = new Chief("select * from chief where chief_id = 'ch000001';");
    }
    
    @BeforeMethod
    public void setUpMethod() throws Exception {}

    @Test
    public void testChiefID() {
        
        Assert.assertTrue(chief.getChiefID().equals("ch000001"));
    }
    
    @Test
    public void testChiefLastName() {
        
        Assert.assertTrue(chief.getChiefLastName().equals("Ivanov"));
    }
    
    @Test
    public void testChiefName() {
        
        Assert.assertTrue(chief.getChiefName().equals("Ivan"));
    }
    
    @Test
    public void testChiefMidName() {
        
        Assert.assertTrue(chief.getChiefMidName().equals("Petrovich"));
    }
    
    @Test
    public void testChiefSalary() {
        
        Assert.assertTrue(chief.getChiefSalary() == 120000);
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {}
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        
        chief = null;
        
        databaseConnector.putQuery("delete from chief where chief_id = 'ch000001';");
        databaseConnector.closeMySQLConnection();
    }
}
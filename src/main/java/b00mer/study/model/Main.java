package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.SQLException;

public class Main {
    
    
    public static void main(String[] args) throws SQLException {

    DatabaseConnector databaseConnector = new DatabaseConnector();
    
    databaseConnector.putQuery("delete from chief where chief_id = 'ch000001';");
    
    databaseConnector.putQuery("insert into chief values ('ch000001', 'Ivanov', 'Ivan', 'Petrovich', 120000);");
    
    Chief chief = new Chief("select * from chief where chief_salary = 120000");
    
    System.out.println(chief.toString());
    
    databaseConnector.closeMySQLConnection();
    
    }
}
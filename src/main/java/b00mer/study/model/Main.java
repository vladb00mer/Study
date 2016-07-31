package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.SQLException;

public class Main {
    
    
    public static void main(String[] args) throws SQLException {

    DatabaseConnector databaseConnector = new DatabaseConnector();
    
    databaseConnector.putQuery("delete from class where chief_id = 'ch0001';");
    databaseConnector.closeMySQLConnection();
    
    }
}
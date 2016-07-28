package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;

public class Main {
    
    
    public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/study";
    String login = "b00mer";
    String pass = "b00mer@@";

    DatabaseConnector databaseConnector = new DatabaseConnector(url, login, pass);
    
    databaseConnector.setDriver();
    
    databaseConnector.setConnection();
    
    databaseConnector.closeConnection();
    
    }
}

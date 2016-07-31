package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chief {

    private String chiefID;
    private String chiefLastName;
    private String chiefName;
    private String chiefMidName;
    private Double chiefSalary;
    
    public Chief (String id, String lastName, String name, String midName){
    
        setChiefID(id);
        setChiefLastName(lastName);
        setChiefName(name);
        setChiefMidName(midName);
    }
    
    public Chief (String dbQuery) throws SQLException {
    
        DatabaseConnector dbConnector = new DatabaseConnector();
                
        ResultSet resultSet = dbConnector.getMySQLStatement().executeQuery(dbQuery);
        
        while (resultSet.next()) {
        
            setChiefID(resultSet.getString("chief_id"));
            setChiefLastName(resultSet.getString("chief_lastName"));
            setChiefName(resultSet.getString("chief_firstName"));
            setChiefMidName(resultSet.getString("chief_midName"));
            setChiefSalary(resultSet.getDouble("chief_salary"));
        }
    
    }
    
    @Override
    public String toString() {
    
        return "\nCHIEF PERSONAL: \n" +  
               "ID: " + getChiefID() + "\n" + 
               "Last Name: " + getChiefLastName() + "\n" +
               "First Name: " + getChiefName() + "\n" + 
               "Mid Name: " + getChiefMidName() + "\n" +
               "Salary: " + getChiefSalary() + " roubles \n";
    }

    public String getChiefID() {
        return chiefID;
    }

    public final void setChiefID(String chiefID) {
        this.chiefID = chiefID;
    }

    public String getChiefLastName() {
        return chiefLastName;
    }

    public final void setChiefLastName(String chiefLastName) {
        this.chiefLastName = chiefLastName;
    }

    public String getChiefName() {
        return chiefName;
    }

    public final void setChiefName(String chiefName) {
        this.chiefName = chiefName;
    }

    public String getChiefMidName() {
        return chiefMidName;
    }

    public final void setChiefMidName(String chiefMidName) {
        this.chiefMidName = chiefMidName;
    }

    public Double getChiefSalary() {
        return chiefSalary;
    }

    public final void setChiefSalary(Double chiefSalary) {
        this.chiefSalary = chiefSalary;
    }
}
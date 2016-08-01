package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

    private String studentID;
    private String studentName;
    private String studentLastName;
    private String studentMidName;
    private String studentClassID;
    
    public Student(String id, String name, String lastName, String midName, String classID) {
    
        setStudentID(id);
        setStudentName(name);
        setStudentLastName(lastName);
        setStudentMidName(midName);
        setStudentClassID(classID);
    }
    
    public Student (String dbQuery) throws SQLException {
    
        DatabaseConnector dbConnector = new DatabaseConnector();
                
        ResultSet resultSet = dbConnector.getMySQLStatement().executeQuery(dbQuery);
        
        while (resultSet.next()) {
        
            setStudentID(resultSet.getString("student_id"));
            setStudentName(resultSet.getString("student_name"));
            setStudentLastName(resultSet.getString("student_lastName"));
            setStudentMidName(resultSet.getString("student_midName"));
            setStudentClassID(resultSet.getString("student_class"));
        }
        
        dbConnector.closeMySQLConnection();
    }
    
    @Override
    public String toString() {
    
        return "\nSTUDENT PERSONAL: \n" +  
               "ID: " + getStudentID()+ "\n" + 
               "Last Name: " + getStudentLastName()+ "\n" +
               "First Name: " + getStudentName()+ "\n" + 
               "Mid Name: " + getStudentMidName()+ "\n" +
               "Class: " + getStudentClass()+ "\n";
    }
    
    public String getStudentID() {
        return studentID;
    }

    public final void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public final void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public final void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentMidName() {
        return studentMidName;
    }

    public final void setStudentMidName(String studentMidName) {
        this.studentMidName = studentMidName;
    }

    public String getStudentClass() {
        return studentClassID;
    }

    public final void setStudentClassID(String studentClassID) {
        this.studentClassID = studentClassID;
    }
}

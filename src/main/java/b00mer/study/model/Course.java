package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {

    private String courseID;
    private String courseName;
    private String courseChiefID;
    private int courseLong;
    
    public Course(String id, String name, int cLong, String chief) {

        setCourseID(id);
        setCourseName(name);
        setCourseLong(cLong);
        setCourseChiefID(chief);
    } 
    
    public Course(String dbQuery) throws SQLException {
    
        DatabaseConnector dbConnector = new DatabaseConnector();
                
        ResultSet resultSet = dbConnector.getMySQLStatement().executeQuery(dbQuery);
        
        while (resultSet.next()) {
        
            setCourseID(resultSet.getString("course_id"));
            setCourseName(resultSet.getString("course_name"));
            setCourseLong(resultSet.getInt("course_long"));
            setCourseChiefID(resultSet.getString("course_chief"));
        }
        
        dbConnector.closeMySQLConnection();
    }
    
    @Override
    public String toString() {
    
        return "\nCOURSE PERSONAL: \n" +  
               "ID: " + getCourseID()+ "\n" + 
               "Name: " + getCourseName()+ "\n" +
               "Chief: " + getCourseChiefID()+ "\n" +
               "Long: " + getCourseLong()+ "\n";
    }

    public String getCourseID() {
        return courseID;
    }

    public final void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseLong() {
        return courseLong;
    }

    public final void setCourseLong(int courseLong) {
        this.courseLong = courseLong;
    }

    public String getCourseChiefID() {
        return courseChiefID;
    }

    public final void setCourseChiefID(String courseChiefID) {
        this.courseChiefID = courseChiefID;
    }
}

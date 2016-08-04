package b00mer.study.model;

import b00mer.study.connector.DatabaseConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;

public class Group {

    private String groupID;
    private String groupChief;
    private TreeSet<String> groupCourses = new TreeSet<>();

    public Group(String groupID, String chiefID) {
            
        setGroupID(groupID);                           
        setGroupChief(chiefID);        
    }

    public Group(String dbQuery) throws SQLException {
            
        DatabaseConnector dbConnector = new DatabaseConnector();
                
        ResultSet resultSet = dbConnector.getMySQLStatement().executeQuery(dbQuery);
        
        while (resultSet.next()) {
        
            setGroupID(resultSet.getString("class_id"));
            setGroupChief(resultSet.getString("chief_id"));
            addCourse(resultSet.getString("course_id"));
        }
        
        dbConnector.closeMySQLConnection();
    }
    
    @Override
    public String toString() {
    
        return "\nGROUP PERSONAL: \n" +  
               "ID: " + getGroupID()+ "\n" + 
               "Chief: " + getChief()+ "\n" +
               "Courses: " + getGroupCourses()+ "\n";
    }
    
    
    public TreeSet<String> getGroupCourses() {
        return groupCourses;
    }

    public void setGroupCourses(String dbQuery) {
        // !!! Заполнение списка курсов
    }
    
    public final void addCourse(String courseID) {
        
        groupCourses.add(courseID);
    }

    public String getChief() {
        return groupChief;
    }

    public String getGroupID() {
        return groupID;
    }

    public final void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupChief() {
        return groupChief;
    }

    public final void setGroupChief(String groupChief) {
        this.groupChief = groupChief;
    }
}
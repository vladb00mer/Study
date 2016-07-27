package b00mer.study.model;

public class Course {

    private String courseID;
    private String courseName;
    private String courseChiefID;
    private String courseLong;
    
    public Course(String id, String name, String chiefID, String cLong) {

        setCourseID(id);
        setCourseName(name);
        setCourseChiefID(chiefID);
        setCourseLong(cLong);
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

    public String getCourseLong() {
        return courseLong;
    }

    public final void setCourseLong(String courseLong) {
        this.courseLong = courseLong;
    }

    public String getCourseChiefID() {
        return courseChiefID;
    }

    public final void setCourseChiefID(String courseChiefID) {
        this.courseChiefID = courseChiefID;
    }
}

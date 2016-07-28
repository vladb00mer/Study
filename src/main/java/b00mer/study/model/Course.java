package b00mer.study.model;

public class Course {

    private String courseID;
    private String courseName;
    private Chief courseChiefID;
    private int courseLong;
    
    public Course(String id, String name, int cLong) {

        setCourseID(id);
        setCourseName(name);
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

    public int getCourseLong() {
        return courseLong;
    }

    public final void setCourseLong(int courseLong) {
        this.courseLong = courseLong;
    }

    public Chief getCourseChiefID() {
        return courseChiefID;
    }

    public final void setCourseChiefID(Chief courseChiefID) {
        this.courseChiefID = courseChiefID;
    }
}

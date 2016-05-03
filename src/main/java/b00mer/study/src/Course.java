package b00mer.study.src;

import javax.ejb.Stateless;

@Stateless
public final class Course {

    private int courseID;
    private String courseName;
    private int courseChiefID;
    private String courseLong;
    
    public Course(int id, String name, int chiefID, String cLong) {

        setCourseID(id);
        setCourseName(name);
        setCourseChiefID(chiefID);
        setCourseLong(cLong);
    } 

    public int getCourseID() {
        return courseID;
    }

    public final void setCourseID(int courseID) {
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

    public int getCourseChiefID() {
        return courseChiefID;
    }

    public void setCourseChiefID(int courseChiefID) {
        this.courseChiefID = courseChiefID;
    }
}

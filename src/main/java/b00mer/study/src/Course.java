package b00mer.study.src;

public class Course {

    private int courseID;
    private String courseName;
    private String courseChief;
    private String courseLong;
    
    public Course(int id, String name, String chief, String cLong) {

        setCourseID(id);
        setCourseName(name);
        setCourseChief(chief);
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

    public String getCourseChief() {
        return courseChief;
    }

    public final void setCourseChief(String courseChief) {
        this.courseChief = courseChief;
    }

    public String getCourseLong() {
        return courseLong;
    }

    public final void setCourseLong(String courseLong) {
        this.courseLong = courseLong;
    }
    
    
}

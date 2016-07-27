package b00mer.study.model;

public class Class {

    private String classID;
    private String classCourse;

    public Class(String id, String classCourse) {
    
        setClassID(id);                           
    }

    public String getClassID() {
        return classID;
    }

    public final void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassCourse() {
        return classCourse;
    }

    public final void setClassCourses(String classCourses) {
        this.classCourse = classCourses;
    }
}

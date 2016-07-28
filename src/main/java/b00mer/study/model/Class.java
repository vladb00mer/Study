package b00mer.study.model;

import java.util.ArrayList;

public class Class {

    private String classID;
    private ArrayList classCourses;
    private Chief classChief;

    public Class(String id) {
    
        setClassID(id);                           
    }

    public String getClassID() {
        return classID;
    }

    public final void setClassID(String classID) {
        this.classID = classID;
    }

    public ArrayList getClassCourse() {
        return classCourses;
    }

    public final void setClassCourses(ArrayList classCourses) {
        this.classCourses = classCourses;
    }

    public Chief getClassChief() {
        return classChief;
    }

    public void setClassChief(Chief classChief) {
        this.classChief = classChief;
    }
}

package b00mer.study.model;

import java.util.ArrayList;

public class Class {

    private int classID;
    private int classChiefID;
    private ArrayList classCourses;

    public Class(int id, int chiefID) {
    
        setClassID(id);            
        setClassChiefID(chiefID);                 
    }

    public int getClassID() {
        return classID;
    }

    public final void setClassID(int classID) {
        this.classID = classID;
    }

    public int getClassChiefID() {
        return classChiefID;
    }

    public final void setClassChiefID(int classChiefID) {
        this.classChiefID = classChiefID;
    }

    public ArrayList getClassCourses() {
        return classCourses;
    }

    public final void setClassCourses(ArrayList classCourses) {
        this.classCourses = classCourses;
    }
}

package b00mer.study.src;

public class Class {

    private int classID;
    private String className;
    private int classChiefID;
    
    
    public Class(int id, String name, int chiefID) {
    
        setClassID(id);           
        setClassName(name);        
        setClassChiefID(chiefID);        
                
    }

    public int getClassID() {
        return classID;
    }

    public final void setClassID(int classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public final void setClassName(String className) {
        this.className = className;
    }

    public int getClassChiefID() {
        return classChiefID;
    }

    public final void setClassChiefID(int classChiefID) {
        this.classChiefID = classChiefID;
    }
    
    
    
}

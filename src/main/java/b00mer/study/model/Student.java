package b00mer.study.model;

public class Student {

    private String studentID;
    private String studentName;
    private String studentLastName;
    private String studentMidName;
    private Class studentClass;
    
    public Student(String id, String name, String lastName, String midName) {
    
        setStudentID(id);
        setStudentName(name);
        setStudentLastName(lastName);
        setStudentMidName(midName);
    }

    public String getStudentID() {
        return studentID;
    }

    public final void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public final void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public final void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentMidName() {
        return studentMidName;
    }

    public final void setStudentMidName(String studentMidName) {
        this.studentMidName = studentMidName;
    }

    public Class getStudentClass() {
        return studentClass;
    }

    public final void setStudentClassID(Class studentClassID) {
        this.studentClass = studentClassID;
    }
}

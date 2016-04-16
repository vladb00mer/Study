package b00mer.study.src;

public class Student {

    private int studentID;
    private String studentName;
    private String studentLastName;
    private String studentMidName;
    
    public Student(int id, String name, String lastName, String midName) {
    
        setStudentID(id);
        setStudentName(name);
        setStudentLastName(lastName);
        setStudentMidName(midName);
                
    }

    public int getStudentID() {
        return studentID;
    }

    public final void setStudentID(int studentID) {
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
    
}

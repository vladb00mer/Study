package b00mer.study.src;

public class Chief {

    private int chiefID;
    private String chiefLastName;
    private String chiefName;
    private String chiefMidName;
    private double chiefSalary;
    
    public Chief(int id, String lastName, String name, String midName, double salary){
    
        setChiefID(id);
        setChiefLastName(lastName);
        setChiefName(name);
        setChiefMidName(midName);
        setChiefSalary(salary);
    }

    public int getChiefID() {
        return chiefID;
    }

    public final void setChiefID(int chiefID) {
        this.chiefID = chiefID;
    }

    public String getChiefLastName() {
        return chiefLastName;
    }

    public final void setChiefLastName(String chiefLastName) {
        this.chiefLastName = chiefLastName;
    }

    public String getChiefName() {
        return chiefName;
    }

    public final void setChiefName(String chiefName) {
        this.chiefName = chiefName;
    }

    public String getChiefMidName() {
        return chiefMidName;
    }

    public final void setChiefMidName(String chiefMidName) {
        this.chiefMidName = chiefMidName;
    }

    public double getChiefSalary() {
        return chiefSalary;
    }

    public final void setChiefSalary(double chiefSalary) {
        this.chiefSalary = chiefSalary;
    }
}

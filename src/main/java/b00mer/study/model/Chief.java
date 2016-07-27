package b00mer.study.model;

public class Chief {

    private String chiefID;
    private String chiefLastName;
    private String chiefName;
    private String chiefMidName;
    private int chiefSalary;
    
    public Chief(String id, String lastName, String name, String midName, int salary){
    
        setChiefID(id);
        setChiefLastName(lastName);
        setChiefName(name);
        setChiefMidName(midName);
        setChiefSalary(salary);
    }

    public String getChiefID() {
        return chiefID;
    }

    public final void setChiefID(String chiefID) {
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

    /**
     * @return the chiefSalary
     */
    public int getChiefSalary() {
        return chiefSalary;
    }

    /**
     * @param chiefSalary the chiefSalary to set
     */
    public final void setChiefSalary(int chiefSalary) {
        this.chiefSalary = chiefSalary;
    }
}

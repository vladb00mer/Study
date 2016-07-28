package b00mer.study.model;

public class Chief {

    private String chiefID;
    private String chiefLastName;
    private String chiefName;
    private String chiefMidName;
    private Double chiefSalary;
    
    public Chief(String id, String lastName, String name, String midName){
    
        setChiefID(id);
        setChiefLastName(lastName);
        setChiefName(name);
        setChiefMidName(midName);
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

    public Double getChiefSalary() {
        return chiefSalary;
    }

    public final void setChiefSalary(Double chiefSalary) {
        this.chiefSalary = chiefSalary;
    }
}

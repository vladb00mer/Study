package b00mer.study.connector;

import javax.ejb.Stateful;

@Stateful
public class DatabaseConnector {
    
    private String dbName;
    private String dbLogin;
    private String dbPassword;
       
    public DatabaseConnector(String name, String login, String password) {
    
        setDbName(name);
        setDbLogin(login);   
        setDbPassword(password);
                
    }

    public String getDbName() {
        return dbName;
    }

    public final void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbLogin() {
        return dbLogin;
    }

    public final void setDbLogin(String dbLogin) {
        this.dbLogin = dbLogin;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public final void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}

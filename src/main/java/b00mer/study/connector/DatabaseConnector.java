package b00mer.study.connector;

public class DatabaseConnector {
    
    private String dbName;
    private String dbLogin;
    private String dbPassword;
    private String dbHost;
    private int dbPort;
    
    public DatabaseConnector(String host, int port, String name, String login, String password) {
    
        setDbHost(host);
        setDbPort(port);
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

    public String getDbHost() {
        return dbHost;
    }

    public final void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public int getDbPort() {
        return dbPort;
    }

    public final void setDbPort(int dbPort) {
        this.dbPort = dbPort;
    }
}

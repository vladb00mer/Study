package b00mer.study.connector;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    
    private String dbURL;
    private String dbLogin;
    private String dbPassword;
    private String dbName;
    
    private Connection connection;
    private Driver driver;
    
    public DatabaseConnector(String url, String login, String password) {
    
        setDbURL(url);
        setDbLogin(login);   
        setDbPassword(password);  
        
        //setDriver();
        //setConnection();
    }
    
    public final void setDriver() {
        try {
            driver = new Driver();
            System.out.println("УСПЕХ при инициализации драйвера SQL");
        } catch (SQLException ex) {
            System.out.println("ОШИБКА! при инициализации драйвера SQL");
        }
        try {
            DriverManager.registerDriver(getDriver());
            System.out.println("УСПЕХ при инициализации драйвера в DriverManager");
        } catch (SQLException ex) {
            System.out.println("ОШИБКА! при инициализации драйвера в DriverManager");
        }
    }
    public Driver getDriver() {
        return driver;
    }

    public final void setConnection() {
        try {
            connection = DriverManager.getConnection(getDbURL(), getDbLogin(), getDbPassword());
            System.out.println("УСПЕХ при инициализации соединения");
        } catch (SQLException ex) {
            System.out.println("ОШИБКА! при инициализации соединения");
        }
        
    }
    
    public void closeConnection() {
        try {
            connection.close();
            System.out.println("УСПЕХ при закрытии соединения");
        } catch (SQLException ex) {
            System.out.println("ОШИБКА! при закрытии соединения");
        }
    }
    
    public Connection getConnection() {
        return connection;
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
    public String getDbURL() {
        return dbURL;
    }
    public final void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }
}
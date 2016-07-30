package b00mer.study.connector;
        
import java.sql.Connection;
import java.sql.Driver;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnector {
    
    private final String dbURL;
    private final String dbLogin;
    private final String dbPassword;
    
    private Driver mySQLDriver;
    private Connection mySQLConnection;
   
       
    public DatabaseConnector(String url, String login, String password) {
       
        dbURL = url;
        dbLogin = login;
        dbPassword = password;
        
    }

    public void setMySQLDriver() {
        try {
            mySQLDriver = new FabricMySQLDriver();
            DriverManager.registerDriver(mySQLDriver);
            System.out.println("SUCCESS to create and register Driver");
        } catch (SQLException ex) {
            System.out.println("FAIL! to create and register Driver");
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    public void setMySQLConnection() {
        try {
            mySQLConnection = DriverManager.getConnection(getDbURL(), getDbLogin(), getDbPassword());
            System.out.println("SUCCESS to create Connection");
        } catch (SQLException ex) {
            System.out.println("FAIL! to create Connection");
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getMySQLConnection() {
        return mySQLConnection;
    }

    public String getDbURL() {
        return dbURL;
    }

    public String getDbLogin() {
        return dbLogin;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
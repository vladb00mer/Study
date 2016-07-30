package b00mer.study.connector;
        
import java.sql.Connection;
import java.sql.Driver;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    
    private final String dbURL;
    private final String dbLogin;
    private final String dbPassword;
    
    private Driver mySQLDriver;
    private Connection mySQLConnection;
    private Statement mySQLStatement;
   
       
    public DatabaseConnector(String url, String login, String password) {
       
        dbURL = url;
        dbLogin = login;
        dbPassword = password;
        
    }

    public void setMySQLDriver() throws SQLException {
        
        mySQLDriver = new FabricMySQLDriver();
            DriverManager.registerDriver(mySQLDriver);
            System.out.println("SUCCESS to create and register Driver");        
    }    

    public void setMySQLConnection() throws SQLException {
        
        mySQLConnection = DriverManager.getConnection(getDbURL(), getDbLogin(), getDbPassword());
            System.out.println("SUCCESS to create Connection");
}
    
    public void putQuery(String query) throws SQLException {
        
        mySQLStatement = mySQLConnection.createStatement();
        
        mySQLStatement.execute(query);
        
        mySQLStatement = null;
    }
    
    public void closeMySQLConnection() throws SQLException {
        
        if (!mySQLConnection.isClosed()) {
        mySQLConnection.close();
        System.out.println("SUCCESS to close Connection");
        } else {
        System.out.println("Connection is already closed");
        }
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
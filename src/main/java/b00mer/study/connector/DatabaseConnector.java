package b00mer.study.connector;
        
import java.sql.Connection;
import java.sql.Driver;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    
    private Driver mySQLDriver;
    private Connection mySQLConnection;
    private Statement mySQLStatement;
   
       
    public DatabaseConnector() throws SQLException {
        
        setMySQLDriver();
        setMySQLConnection();
        setMySQLStatement(mySQLConnection.createStatement());
        
    }

    public final void setMySQLDriver() throws SQLException {
        
        mySQLDriver = new FabricMySQLDriver();
            DriverManager.registerDriver(mySQLDriver);
            System.out.println("SUCCESS to create and register Driver");        
    }    

    public final void setMySQLConnection() throws SQLException {
        
        mySQLConnection = DriverManager.getConnection(ConnectionParams.URL, ConnectionParams.LOGIN, ConnectionParams.PASSWORD);
        System.out.println("SUCCESS to create Connection");
}
    
    public void putQuery(String query) throws SQLException {       
        
        getMySQLStatement().execute(query);
        
    }
    
    public ResultSet executeQuery(String query) throws SQLException {
    
        return getMySQLStatement().executeQuery(query);
    }
    
    public void closeMySQLConnection() throws SQLException {
        
        if (!mySQLConnection.isClosed()) {
        mySQLConnection.close();
        System.out.println("SUCCESS to close Connection");
        } else {
        System.out.println("Connection is already closed");
        }
    }

    public Statement getMySQLStatement() {
        return mySQLStatement;
    }

    public final void setMySQLStatement(Statement mySQLStatement) {
        this.mySQLStatement = mySQLStatement;
    }
}
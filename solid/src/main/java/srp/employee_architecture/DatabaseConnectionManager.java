package srp.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection connection;

    private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
    private DatabaseConnectionManager() {}

    public void connect() {
        try {
            connection = DriverManager.getConnection("Database URL");
            System.out.println("Connection successful" );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Disconnect");
    }
}

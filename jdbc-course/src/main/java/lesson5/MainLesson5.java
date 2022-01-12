package lesson5;

import java.sql.*;

public class MainLesson5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String userName = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            String createTable = "CREATE TABLE IF NOT EXISTS fruit (name VARCHAR(15) NOT NULL, amount INTEGER, price DOUBLE, PRIMARY KEY(name))";
            String command1 = "INSERT INTO fruit (name, amount, price) VALUES ('Apple', 200, 15) ";
            String command2 = "INSERT INTO fruit (name, amount, price) VALUES ('Orange', 50, 5.65) ";
            String command3 = "INSERT INTO fruit (name, amount, price) VALUES ('Lemon', 10, 50) ";


//            connection.setAutoCommit(false);
//            statement.executeUpdate(createTable);
//            statement.executeUpdate(command1);
//            statement.executeUpdate(command2);
//            Savepoint savepoint = connection.setSavepoint();
//            statement.executeUpdate(command3);
////            connection.commit();
//            connection.rollback(savepoint);
//            connection.commit();

            connection.setAutoCommit(true);
            statement.addBatch(createTable);
            statement.addBatch(command1);
            statement.addBatch(command2);
            statement.addBatch(command3);
            statement.executeBatch();
        }
    }
}

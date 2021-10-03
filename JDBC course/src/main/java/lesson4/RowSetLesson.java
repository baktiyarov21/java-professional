package lesson4;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowSetLesson {
    static String url = "jdbc:mysql://localhost:3306/gb_database";
    static String userName = "root";
    static String password = "248163264Smallville";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = getResultSet();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
    }

    static ResultSet getResultSet() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()){
            ResultSet rs = statement.executeQuery("SELECT * FROM books");
            RowSetFactory rsf = RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = rsf.createCachedRowSet();
            cachedRowSet.populate(rs);
            return cachedRowSet;
        }
    }
}

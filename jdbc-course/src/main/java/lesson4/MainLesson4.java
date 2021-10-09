package lesson4;

import java.sql.*;

public class MainLesson4 {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String userName = "root";
        String password = "248163264Smallville";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

            ResultSet rs = null;
            try {
                rs = statement.executeQuery("SELECT * FROM books");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double price = rs.getDouble(3);
                   // rs.absolute(4);
//                    if (id == 17) {
//                        rs.updateString(2, "SCO");
//                        rs.updateDouble(3, 12.2);
//                        rs.updateRow();
//                    }
                    ResultSetMetaData resultSetMetaData = rs.getMetaData();
                    while (rs.next()) {
                        for(int i = 1; i <= resultSetMetaData.getColumnCount(); ++i) {
                            String field = resultSetMetaData.getColumnName(i);
                            String value = rs.getString(field);
                            System.out.print(field + " " + value);
                        }
                        System.out.println();
                    }
                }
            } finally {
                if (rs != null) {
                    rs.close();
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

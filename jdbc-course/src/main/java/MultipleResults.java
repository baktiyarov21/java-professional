import java.sql.*;

public class MultipleResults {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String userName = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             CallableStatement callableStatement = connection.prepareCall("{CALL tablesCount}")){
            boolean hasResilts = callableStatement.execute();
            ResultSet rs = null;
            try {
                while (hasResilts) {
                    rs = callableStatement.getResultSet();
                    while (rs.next()) {
                        System.out.println("Количество записей в таблице" + rs.getInt(1));
                    }
                    hasResilts = callableStatement.getMoreResults();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                if (rs != null) {
                    rs.close();
                }
            }
        }
    }
}

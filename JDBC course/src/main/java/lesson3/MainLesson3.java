package lesson3;

import java.sql.*;

public class MainLesson3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String userName = "root";
        String password = "248163264Smallville";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password)){
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("INSERT  INTO books (name, price) VALUES (?, ?)");
                preparedStatement.setString(1, "Schindler's list");
                preparedStatement.setDouble(2, 100.2);
                preparedStatement.execute();

                ResultSet rs = null;
                try{
                    rs = preparedStatement.executeQuery("SELECT * FROM books");
                    while(rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        double price = rs.getDouble(3);
                        System.out.println(id + " " + name + " " + price);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } finally {
                    if (rs != null) {
                        rs.close();
                    } else
                        System.err.println("Ошибка");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                preparedStatement.close();
            }
            CallableStatement callableStatement = null;
            try {
                callableStatement = connection.prepareCall("{CALL booksCount(?)}");
                callableStatement.registerOutParameter(1, Types.INTEGER);
                callableStatement.execute();
                System.out.println("Количество записей в таблице " + callableStatement.getInt(1));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                callableStatement.close();
            }
        }

    }
}

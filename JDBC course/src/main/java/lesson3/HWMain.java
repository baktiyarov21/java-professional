package lesson3;

import java.sql.*;
import java.util.Scanner;

public class HWMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String name = "root";
        String ps = "248163264Smallville";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection connection = DriverManager.getConnection(url,name,ps);
            Scanner scanner = new Scanner(System.in);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO phone(LastName, Phone) VALUES (?, ?)")) {
//            statement.executeUpdate("DELETE FROM phone WHERE idPhoneName = 1");
            System.out.println("Введите имя: ");
            String lastNameFromConsole = scanner.nextLine();
            System.out.println("Введите номер: ");
            int phoneFromConsole = scanner.nextInt();
            preparedStatement.setString(1, lastNameFromConsole);
            preparedStatement.setInt(2, phoneFromConsole);
            preparedStatement.execute();

            try(ResultSet rs = preparedStatement.executeQuery("SELECT * FROM phone")) {
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String lastName = rs.getString(2);
                    int phone = rs.getInt(3);
                    System.out.println(id + " " + lastName + " " + phone);
                }
            }
        }
    }
}

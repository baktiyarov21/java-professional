import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  ClassNotFoundException, SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String userName = "root";
        String password = "248163264Smallville";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Arsen\\IdeaProjects\\JUnitLesson\\src\\main\\java\\books.sql"));
             Scanner scanner = new Scanner(reader);
             Statement statement = connection.createStatement()) {
            String line = "";
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.endsWith(";")) {
                    line = line.substring(0, line.length() - 1);
                }
                statement.executeUpdate(line);
            }
            ResultSet resultSet = null;
            try {
                resultSet = statement.executeQuery("SELECT * FROM books");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    double price = resultSet.getDouble(3);
                    System.out.println("Id= " + id + " Name= " + name + " price" + price);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.err.println("Ошибка");
            } finally {
                if (resultSet != null) {
                    resultSet.close();
                } else {
                    System.err.println("Ошибка чтения данных с БД");
                }
            }
        }

    }
}
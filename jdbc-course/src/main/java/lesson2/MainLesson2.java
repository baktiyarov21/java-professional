package lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLesson2 {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        ArrayList<Abonent> abonents = new ArrayList<>();

        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/gb_database";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, user, password);
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Arsen\\IdeaProjects\\JUnitLesson\\src\\main\\java\\lesson2\\phone.sql"));
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM phone");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int number = resultSet.getInt(3);
                Abonent abonent = new Abonent(id, name, number);
                abonents.add(abonent);
            }

            System.out.println("Successful");
        } catch (SQLException | IOException throwables) {
            throwables.printStackTrace();
        }
        for (Abonent abonent : abonents) {
            if (abonent.getId()> 3)
            System.out.println(abonent.toString());
        }
    }
}

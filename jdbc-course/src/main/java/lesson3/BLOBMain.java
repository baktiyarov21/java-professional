package lesson3;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class BLOBMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        String url = "jdbc:mysql://localhost:3306/gb_database";
        String userName = "root";
        String password = "248163264Smallville";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()){
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS images (name VARCHAR (15), d DATE, image BLOB)");

            PreparedStatement preparedStatement = null;
            try {
                BufferedImage image = ImageIO.read(new File("Chandler.jpg"));
                Blob blob = connection.createBlob();
                try (OutputStream outputStream = blob.setBinaryStream(1)){
                    ImageIO.write(image,"jpg", outputStream);
                }
                preparedStatement = connection.prepareStatement("INSERT INTO images(name, d, image) VALUES (?, {d ?}, ?) ");
                preparedStatement.setString(1, "Chan");
                preparedStatement.setDate(2, Date.valueOf("2021-04-07"));
                preparedStatement.setBlob(3, blob);
                preparedStatement.execute();

                ResultSet set = null;
                try {
                    set = preparedStatement.executeQuery("SELECT * FROM images");
                    while (set.next()) {
                        Blob chan = set.getBlob("image");
                        BufferedImage image1 = ImageIO.read(chan.getBinaryStream());
                        File file = new File("saved.jpg");
                        ImageIO.write(image1, "jpg", file);

                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if (set != null) {
                        set.close();
                    } else
                        System.err.println("Ошибка");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                preparedStatement.close();
            }

        }
    }
}

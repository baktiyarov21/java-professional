package stream.lesson;

import java.io.*;
import java.util.Scanner;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOOut.txt")))){
            out.writeShort(1000);
            out.writeInt(1111);
            out.writeLong(10L);
            out.writeUTF("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        File file = new File("about.txt");
        try (OutputStream outputStream = new FileOutputStream(file,true)){
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

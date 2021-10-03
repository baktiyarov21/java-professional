package stream.lesson;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class SimpleRandomAccess {
    public static void main(String[] args) {
        try(RandomAccessFile raf = new RandomAccessFile("about.txt", "rw")) {
            raf.write(new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
            raf.seek(3);
            raf.write(new byte[] {20, 30, 40});
            raf.seek(0);
            byte[] bytes = new byte[10];
            int n = raf.read(bytes, 0, 10);
            System.out.println(Arrays.toString(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

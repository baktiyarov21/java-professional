package stream.lesson;

import java.io.ByteArrayInputStream;

public class StreamMain {
    public static void main(String[] args) {
        byte[] arr = new byte[] {1, 5, 10, 20, 23};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int tmp;
        while ((tmp = byteArrayInputStream.read()) != -1) {
            System.out.println(tmp);
        }

        String str = "I opened my eyes";
        byte[] arrStr = str.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arrStr);
        int tmp2;
        while ((tmp2 = byteArrayInputStream1.read()) != -1) {
            System.out.print((char) tmp2);
        }

    }
}

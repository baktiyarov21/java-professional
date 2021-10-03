package stream.lesson;

import java.io.*;
import java.util.Scanner;

public class SimpleBufferedReader {
    public static void main(String[] args) {

        //Класс FileOutputStream предназначен для записи байтов в файл.
        //Для считывания данных из файла предназначен класс FileInputStream

      /*  try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(bufferedReader.readLine());
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

     /*   int i = System.in.read();// System.in считывает байты
        System.out.println(i);
        System.out.println((char) i);*/

  /*      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int j = inputStreamReader.read();
        System.out.println(j);
        System.out.println((char) j);*/

       /* Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        byte[] bytes = text.getBytes();
        File file = new File("out.txt");
        OutputStream os = new FileOutputStream(file, true);
        os.write(bytes);*/
        long start = System.currentTimeMillis();
        File file = new File("out.txt");
        StringBuilder stringBuilder = new StringBuilder();
        try( InputStreamReader is = new InputStreamReader(new FileInputStream(file))) {
            char[] chars= new char[100];
            int tmp = is.read(chars);
            while ( tmp != -1) {
                stringBuilder.append(new String(chars, 0, tmp));
                tmp = is.read(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long finish = System.currentTimeMillis();
        System.out.println("\n "+ " " + (finish - start));
        System.out.println(stringBuilder.toString());

    }
}

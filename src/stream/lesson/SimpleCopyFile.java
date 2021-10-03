package stream.lesson;

import java.io.*;
import java.nio.file.Files;

public class SimpleCopyFile {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("C:\\Users\\Arsen\\IdeaProjects\\Patterns\\src\\stream\\lesson\\source.txt");
        File targetFile = new File("C:\\Users\\Arsen\\IdeaProjects\\Patterns\\src\\stream\\lesson\\target.txt");

       // Files.copy(sourceFile.toPath(), targetFile.toPath());

        InputStreamReader is = new InputStreamReader(new FileInputStream(sourceFile));
        int i;
        while ((i = is.read()) != -1) {
            System.out.print((char)i);
        }
    }
}

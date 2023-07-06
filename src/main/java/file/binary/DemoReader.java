package file.binary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) {
        demoFileOutputStream();
    }

    private static void demoFileOutputStream() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("demo_01.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

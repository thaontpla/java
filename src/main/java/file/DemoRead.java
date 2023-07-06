package file;

import java.io.*;
import java.util.Scanner;

public class DemoRead {
    public static void main(String[] args) {
        //emoInputStreamReader();
        //demoBufferReader();
        demoScannerToReadFile();
    }

    private static void demoScannerToReadFile() {
        try {
            Scanner scanner = new Scanner(new File("C:\\file\\abc.txt"));
            while (scanner.hasNext()) { //còn gì để đọc ko?
                String s = scanner.nextLine();
                if (s == null) {
                    break;
                }
                System.out.println(s);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demoBufferReader() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\file\\abc.txt"));
            while (true) {
                String s = bufferedReader.readLine();
                if (s == null) {
                    break;
                }
                System.out.println(s);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demoInputStreamReader() {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\file\\abc.txt"));
            while (true) {
                int x = (char) inputStreamReader.read();
                if (x == -1) {
                    break;
                }
                System.out.print((char) x);
            }
            inputStreamReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

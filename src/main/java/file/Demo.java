package file;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File file = new File("C:\\English level 3\\abc.txt");
        System.out.println(file.isFile());
    }
}

package file;

import java.io.File;
import java.io.IOException;


public class Demo {
    public static void main(String[] args) {
        File file = new File("C:\\file\\abc.txt");
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getParentFile());
//        try {
//            boolean newFile= file.createNewFile();
//            System.out.println(newFile);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //file.delete();
        System.out.println(file.length());
    }
}

package file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoWriter {
    public static void main(String[] args) {
//        demoOutputStreamWriter();
//        List<Student> students = readStudentFromFile();
//        System.out.println(students);
        demoPrintWriter();
    }

    private static void demoPrintWriter() {
        try {
            PrintWriter printWriter = new PrintWriter(new File("C:\\file\\hihi.txt"));
            printWriter.print("test");
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demoOutputStreamWriter() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student(i,"Nguyen Van", "A"));
        }
        //System.out.println(students);
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\file\\xyz.txt"));
            //outputStreamWriter.write("file mới");
            for (int i = 0; i < students.size(); i++) {
                outputStreamWriter.write(students.get(i).toString() + "\n");
            }
            outputStreamWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static List<Student> readStudentFromFile(){
        List<Student> students = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("C:\\file\\xyz.txt"));
            while (scanner.hasNext()){
                String s = scanner.nextLine();
                if ( s == null || s.trim().equals("")) {
                    continue;
                }
                String[] studentElement = s.split(",");
                Student student = new Student(Integer.parseInt(studentElement[0]),studentElement[1],studentElement[2]);
                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}

package file.binary;

import file.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoReader {
    public static void main(String[] args) {
//        demoFileOutputStream();
//        demoFileInputStream();
//        demoBufferedOutputStream();
//        demoObjectOutputStream();
        //System.out.println(demoObjectInputStream());
        //demoBufferedWriter(); //dùng để ghi nối thêm dữ liệu
        demoTryWithResource();//auto close file

    }

    private static List<Student> demoTryWithResource() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo-object.txt"));
            ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("demo-object.txt"));) {
            List<Student> students= (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            return students;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void demoBufferedWriter() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt", true));
            bufferedWriter.write(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static List<Student> demoObjectInputStream() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo-object.txt"));
            List<Student> students= (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            return students;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void demoObjectOutputStream() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo-object.txt"));
            List<Student> students = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                students.add(new Student(i, "Nguyen Van", "A"));
            }
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void demoBufferedOutputStream() {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("file02.txt"));
            //bufferedOutputStream.write();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demoFileOutputStream() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("file02.txt");
            fileOutputStream.write('N');
            fileOutputStream.write('g');
            fileOutputStream.write('u');
            fileOutputStream.write('y');

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demoFileInputStream() {
        try {
            FileInputStream fileInputStream = new FileInputStream("file02.txt");
            while (true) {
                int x = fileInputStream.read();
                if (x == -1) {
                    break;
                }
                System.out.print((char) x);
            }
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

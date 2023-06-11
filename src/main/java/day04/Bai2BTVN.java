package day04;

//Bài 2:
//Viết chương trình Java để tìm các phần tử trong mảng 1 xuất hiện tại mảng thứ 2 (giá trị chuỗi) in các phần tử đó ra
//String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
//String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
public class Bai2BTVN {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}

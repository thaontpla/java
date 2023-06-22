package day11.string;

public class RemoveTrim {
    public static void main(String[] args) {
        String regex = "\\s+";
        String str = "demo     demo";
        String[] s = str.split(regex);
        System.out.println(str.replaceAll("\\s+", " "));
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

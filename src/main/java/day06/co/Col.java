package day06.co;

import day06.ch.Cha;

public class Col extends Cha {
    static String name = "Duong";
    //static String dad = super.age;
    public void ten() { // cho vào phương thức mới gọi đc. bỏ static đi vì trong cùng static mới gọi đc
        //System.out.println(name);
        super.ten(); //inra Dad
        //this.ten(); in ra Duong
    }

    public static void main(String[] args) {}


}

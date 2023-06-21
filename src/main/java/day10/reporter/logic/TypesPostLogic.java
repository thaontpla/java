package day10.reporter.logic;

import day10.reporter.entity.TypePost;

import java.util.Scanner;

public class TypesPostLogic {
    TypePost[] types = new TypePost[100];
    public void add() {
        System.out.print("Bạn muốn thêm mới bao nhiêu kiểu bài viết: ");
        int numberType = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberType; i++) {
            System.out.println("Nhập thông tin kiểu bài viết thứ " + (i+1));
            TypePost type = new TypePost();
            type.inputInfo();
            saveTypesPost(type);
        }
    }
    private void saveTypesPost(TypePost typePost) {
        for (int i = 0; i < types.length; i++) {
            if (types[i] == null) {
                types[i] = typePost;
                break;
            }
        }
    }

    public void show() {
        for (int i = 0; i < types.length; i++) {
            if (types[i] != null) {
                System.out.println(types[i]);
            }
        }
    }
}

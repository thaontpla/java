package day10.reporter.logic;

import day10.reporter.entity.Reporter;

import java.util.Arrays;
import java.util.Scanner;

public class ReporterLogic {
    Reporter[] reporters = new Reporter[100];
    public void add() {
        System.out.print("Bạn muốn thêm mới bao nhiêu phong viên: ");
        int numberReporter = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberReporter; i++) {
            System.out.println("Nhập thông tin phóng viên thứ " + (i+1));
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            saveReporter(reporter);
        }
    }

    private void saveReporter(Reporter reporter) {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] == null) {
                reporters[i] = reporter;
                break;
            }
        }
    }

    public void show() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null){
                System.out.println(reporters[i]);
            }
        }
    }

    public void arrangeIncrease() {
        Arrays.sort(reporters);
    }
}

package day02;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ngay thang nam sinh cua ban (theo dinh dang dd/MM/yyyy): ");
        String birthdayString = input.nextLine();

        // Chuyen doi chuoi ngay sinh thanh LocalDate
        LocalDate birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Tinh tuoi
        LocalDate today = LocalDate.now();
        int tuoi = Period.between(birthday, today).getYears();

        System.out.println("Tuoi cua ban la: " + tuoi);
    }
}

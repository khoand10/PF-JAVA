package Bien_KieuDL_ToanTu;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ Celsius :");
        int c = sc.nextInt();
        System.out.println(c +" Celsius = "+(9*c)/5+32+" Fahrenheit");
    }
}

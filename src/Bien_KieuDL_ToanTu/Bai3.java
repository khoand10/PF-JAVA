package Bien_KieuDL_ToanTu;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn :");
        float radius = sc.nextFloat();
        final double PI = 3.14159;
        System.out.println("Chu vi hình tròn là :" +(radius*2*PI));
        System.out.println("Diện tích hình tròn :" +(radius*radius*PI));
    }
}

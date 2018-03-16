package Bien_KieuDL_ToanTu;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm sinh của bạn ");
        int namSinh = sc.nextInt();
        System.out.println("Bạn sinh năm :"+namSinh+"\t"+(2018-namSinh)+ "tuổi");
    }
}

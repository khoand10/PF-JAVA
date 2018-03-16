package Bien_KieuDL_ToanTu;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER money (USD) :");
        float tienUSD = sc.nextFloat();
        float tienVND = tienUSD*23000;
        System.out.println(tienUSD+"USD = "+tienVND);
    }
}

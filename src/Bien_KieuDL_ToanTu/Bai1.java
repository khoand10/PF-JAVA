package Bien_KieuDL_ToanTu;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Vật Lý :");
        float diemVatLy = sc.nextFloat();
        System.out.println("Nhập điểm hóa học :");
        float diemHoaHoc = sc.nextFloat();
        System.out.println("Nhập điểm sinh học");
        float diemSinhHoc = sc.nextFloat();
        float tongDiem = diemVatLy+diemHoaHoc+diemSinhHoc;
        float diemTb = tongDiem/3;
        System.out.println("Tổng điểm là :"+tongDiem);
        System.out.println("Điểm Trung Bình là :"+diemTb);
    }
}

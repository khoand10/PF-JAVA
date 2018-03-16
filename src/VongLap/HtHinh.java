package VongLap;

public class HtHinh {
    public static void main(String[] args) {
        //Hinh chu nhat
//        for (int i = 0; i < 3; i++) {
//            System.out.println("*************");
//        }

        //tam giac
/// /        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println("*");
//        }

        //tam giac deu
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

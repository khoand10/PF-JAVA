package DieuKien;

public class fd {
    public static void main(String[] args) {
        int year = 2018;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("X");
        } else {
            System.out.println("Y");
        }
    }
}

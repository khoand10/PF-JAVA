package DieuKien;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        System.out.println("Enter your year working");
        int year = sc.nextInt();
        if (salary >= 1 && salary <= 5) {
            double salaryTotal = salary * 4000000 + year * 500000;
            System.out.println("Salary total :"+salaryTotal);
        }else{
            System.out.println("Error!!!");
        }
    }
}

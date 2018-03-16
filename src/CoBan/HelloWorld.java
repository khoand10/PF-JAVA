package CoBan;

import java.util.Date;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name?");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}

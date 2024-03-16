package TD1.Ex1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a, b;
        float c;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the dividend: ");
            a = sc.nextInt();
            System.out.println("Enter the divisor: ");
            b = sc.nextInt();
            sc.close();

            c = (float) a / b;
            System.out.println("The result of the division is: " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

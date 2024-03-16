package TD1.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    public static void saisieCorrecte(int n) {
        try {
            if (n < 0) {
                throw new InputMismatchException("Number must be greater than zero!");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void saisieSup10(int n) {
        try {
            if (n < 10) {
                throw new IllegalArgumentException("Number must be greater than ten!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        saisieCorrecte(input);
        saisieSup10(input);
    }
}

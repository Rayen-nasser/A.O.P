package TD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        List<String> listeOriginale = new ArrayList<>();

        System.out.print("enter Nomber de l'elements: ");
        Scanner scanner = new Scanner(System.in);

        int nombreElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nombreElements; i++) {
            System.out.print("Enter New Element " + (i + 1) + " : ");
            String element = scanner.nextLine();
            listeOriginale.add(element);
        }

        scanner.close();

        List<String> listeCopiee = new ArrayList<>(listeOriginale);

        System.out.println("Liste origin : " + listeOriginale);
        System.out.println("Liste copie : " + listeCopiee);
    }
}

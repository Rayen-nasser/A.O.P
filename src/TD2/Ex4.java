package TD2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        System.out.print("enter Nomber de l'elements: ");
        Scanner scanner = new Scanner(System.in);

        int nombreElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nombreElements; i++) {
            System.out.print("entrez le nouvel element " + (i + 1) + " : ");
            String element = scanner.nextLine();
            list.add(element);
        }

        scanner.close();

        System.out.println("List original : " + list);

        ListIterator iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}

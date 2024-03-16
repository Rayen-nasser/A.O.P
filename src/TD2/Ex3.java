package TD2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        List l1 = new ArrayList<>();

        System.out.println("Write number of element you will enter in l1:");
        Scanner sc = new Scanner(System.in);

        int nb1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nb1; i++){
            System.out.print("Write New Element " + (i + 1) + " : ");
            String element = sc.nextLine();
            l1.add(element);
        }

        List l2 = new ArrayList<>();

        System.out.println("Write number of element you will enter in l2:");

        int nb2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nb2; i++){
            System.out.print("Write New Element " + (i + 1) + " : ");
            String element = sc.nextLine();
            l2.add(element);
        }

        System.out.println("compare two arraylist:" +l1.contains(l2));
        List mergedList = new ArrayList<>(l1);
        mergedList.addAll(l2);

        System.out.println("Merged list: " + mergedList);
    }
}

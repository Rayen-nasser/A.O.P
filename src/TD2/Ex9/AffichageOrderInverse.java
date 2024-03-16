package TD2.Ex9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AffichageOrderInverse {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(5);
        tab.add(19);
        tab.add(26);
        tab.add(42);
        tab.add(80);

        // Method 1
        System.out.println("Method 1:");
        Iterator<Integer> iterator = tab.listIterator(tab.size());
        while(((ListIterator<Integer>) iterator).hasPrevious()){
            System.out.println(((ListIterator<Integer>) iterator).previous());
        }

        // Method 2
        System.out.println("Method 2:");
        for (int i = tab.size() - 1; i >= 0; i--) {
            System.out.println(tab.get(i));
        }

    }
}

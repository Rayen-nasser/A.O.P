package TD2.Ex9;

import java.util.ArrayList;

public class AffichageRangPair {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(5);
        tab.add(19);
        tab.add(26);
        tab.add(42);
        tab.add(80);

        // Method 1
        System.out.println("Method 1:");
        for (int i = 0; i < tab.size(); i++){
            if(tab.get(i) % 2 == 0)
                System.out.println(tab.get(i));
        }

        // Method 2
        System.out.println("Method 2:");
        for (int value : tab) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }

    }
}

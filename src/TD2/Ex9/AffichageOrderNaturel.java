package TD2.Ex9;

import java.util.ArrayList;
import java.util.Iterator;

public class AffichageOrderNaturel {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(5);
        tab.add(19);
        tab.add(26);
        tab.add(42);
        tab.add(80);

        // Method 1
        System.out.println("Method 1:");
        for (Integer item : tab){
            System.out.println(item);
        }


        // Method 2
        System.out.println("Method 2:");
        for (int i = 0; i < tab.size() ; i++){
            System.out.println(tab.get(i));
        }

        // Method 3
        System.out.println("Method 3:");
        int i = 0;
        while(i < tab.size()){
            System.out.println(tab.get(i));
            i++;
        }

        // Method 4
        System.out.println("Method 4:");
        Iterator<Integer> iterator = tab.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Method 5
        System.out.println("Method 5:");
        tab.forEach(value -> System.out.println(value));

    }
}

package TD2.Ex9;

import java.util.ArrayList;

public class AffichageValueNegative {
    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(5);
        tab.add(-19);
        tab.add(26);
        tab.add(-42);
        tab.add(80);

        // Affichage des éléments de rang pair
        System.out.println("Affichage des éléments de rang pair:");
        for (int i = 0; i < tab.size(); i += 2) {
            System.out.println(tab.get(i));
        }

        // Mise à zéro des éléments de valeur négative
        System.out.println("Mise à zéro des éléments de valeur négative:");
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) < 0) {
                tab.set(i, 0);
            }
        }
        System.out.println(tab);
    }
}

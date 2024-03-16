package TP2.Ex1;

import java.util.Set;
import java.util.TreeSet;

public class ExempleComparator {
    public static void main(String[] args) {

        Set<Employe> ts1 = new TreeSet<>(new NomComp());

        ts1.add(new Employe("Bob", 60000));
        ts1.add(new Employe("David", 55000));
        ts1.add(new Employe("Charlie", 45000));
        ts1.add(new Employe("Alice", 50000));

        System.out.println("Tri par nom :");
        for (Employe employe : ts1) {
            System.out.println(employe);
        }

        Set<Employe> ts2 = new TreeSet<>(new SalaireComp());

        ts2.add(new Employe("Alice", 50000));
        ts2.add(new Employe("Bob", 60000));
        ts2.add(new Employe("Charlie", 45000));
        ts2.add(new Employe("David", 55000));

        System.out.println("\nTri par salaire :");
        for (Employe employe : ts2) {
            System.out.println(employe);
        }
    }
}

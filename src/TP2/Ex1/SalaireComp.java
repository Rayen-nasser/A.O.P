package TP2.Ex1;

import TP2.Ex1.Employe;

import java.util.Comparator;

public class SalaireComp implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return Integer.compare(e1.getSalaire(), e2.getSalaire());
    }
}

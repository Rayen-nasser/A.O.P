package TP2.Ex1;

import TP2.Ex1.Employe;

import java.util.Comparator;

public class NomComp implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNom().compareTo(e2.getNom());
    }
}

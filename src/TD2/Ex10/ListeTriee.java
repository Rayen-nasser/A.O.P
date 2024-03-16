package TD2.Ex10;

import java.util.LinkedList;

public class ListeTriee {
    private LinkedList<String> liste;

    public ListeTriee() {
        liste = new LinkedList<>();
    }

    public void ajoute(String element) {
        int index = 0;
        while (index < liste.size() && element.compareTo(liste.get(index)) > 0) {
            index++;
        }
        liste.add(index, element);
    }

    public void affiche() {
        for (String element : liste) {
            System.out.println(element);
        }
    }
}

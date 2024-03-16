package TD2.Ex10;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ListeTriee list = new ListeTriee();

        list.ajoute("mohamed");
        list.ajoute("isa");
        list.ajoute("mosa");
        list.ajoute("ibrahim");
        list.ajoute("noh");
        list.ajoute("ahmed");

        list.affiche();
    }
}

package TD2;

import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.add("mohamed");
        list.add("hamza");
        list.add("khalid");
        list.add("rayen");

        list.add(2,"omar");

        System.out.println("List : " + list);

    }
}

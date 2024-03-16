package TD2;

import java.util.LinkedList;

public class Ex6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.add("mohamed");
        list.add("hamza");
        list.add("khalid");
        list.add("rayen");

        System.out.println("Last: " + list.getLast());
        System.out.println("first: " + list.getFirst());
    }
}

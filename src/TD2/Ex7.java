package TD2;

import java.util.Collections;
import java.util.LinkedList;

public class Ex7 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add("mohamed");
        list.add("hamza");
        list.add("khalid");
        list.add("rayen");

        System.out.println("List before permutation: " + list);
        Collections.swap(list, 0,2);
        System.out.println("List after permutation: " + list);

        Collections.shuffle(list);
        System.out.println("after shuffle: " + list);

        LinkedList cloneList = new LinkedList<>(list);
        System.out.println("clone list: " +cloneList);
    }
}

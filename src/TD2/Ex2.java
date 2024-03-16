package TD2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(5);
        list.add("ali");
        list.add(46);
        list.add("##");

        System.out.println("Before Shuffle : " + list);
        Collections.shuffle(list);
        System.out.println("After shuffle and before reverse: " + list);
        Collections.reverse(list);
        System.out.println("After reverse: " + list);

    }
}

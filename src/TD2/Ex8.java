package TD2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add("mohamed");
        list.add("hamza");
        list.add("khalid");
        list.add("rayen");

        System.out.println("list:" + list);
        System.out.println("who element do you want to change that:");
        Scanner sc = new Scanner(System.in);
        int index = list.indexOf(sc.next());

        System.out.println("Write new value:");
        String newValue = sc.next();

        if(index != -1){
            list.set(index, newValue);
        }else{
            System.out.println("not found");
        }

        ArrayList arrayList = new ArrayList<>(list);
        System.out.println("Arraylist: " +  arrayList);
    }
}

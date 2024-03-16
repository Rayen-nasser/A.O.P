package TP2.Ex2;

import java.util.HashMap;
import java.util.Map;

public class Formation {
    public Map listM;
    private int id;
    public Formation(int i){
        this.id = i;
        this.listM = new HashMap<>();
    }

    public void add(String m,float c){
        listM.put(m , c);
    }

    public void remove(String m){
        listM.remove(m);
    }

    public float getCoff(String m){
        float c = (float) listM.get(m);
        return c;
    }

    public void decrireForm() {
        System.out.println("Formation " + id + "\nMatière | Coef");
        for (Object k : listM.keySet()) {
            System.out.println(k + " => " + listM.get(k));
        }
    }
}



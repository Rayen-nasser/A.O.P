package TP1.Ex1;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args)  {
        int f = 1;
        System.out.println("write number: ");
        Scanner n = new Scanner(System.in);

        try {
            int num = Integer.parseInt(n.next());
            if(num < 0){
                throw new NombreNegatifException("number est nigative");
            }

            if(num == 0){
               System.out.println("la valeur de factoriel est:" + 1);
           }else{
               for (int i = 2; i <= num; i++)
                    f = f * i;
               System.out.println("factor:" + f);
           }

        }  catch (NombreNegatifException e) {
            System.out.println("Erreur: "+  e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erreur: "+  e.getMessage());
        }
    }

}

class NombreNegatifException extends Exception {
    public NombreNegatifException(String message) {
        super(message);
    }
}
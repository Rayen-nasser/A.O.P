package TD1.Ex3;

public class Toutou {
    private String nom;
    private int nombrePuces;
    public Toutou(String n, int np){
        if (n == null) {
            throw new IllegalArgumentException("Le nom ne peut pas être null !");
        }
        if (np < 0) {
            throw new IllegalArgumentException("Le nombre de puces ne peut pas être négatif !");
        }
        nom = n;
        nombrePuces = np;
    }

    public static void main(String[] args) {
        try {
            Toutou toutou1 = new Toutou("milou", 4);
            System.out.println("toutou 1 cree avec succes !");
        } catch (IllegalArgumentException e) {
            System.out.println("erreur lors de la creation de toutou 1 : " + e.getMessage());
        }

        try {
            Toutou toutou2 = new Toutou("medor", -11);
            System.out.println("Toutou 2 cree avec succès !");
        } catch (IllegalArgumentException e) {
            System.out.println("erreur lors de la création de toutou 2 : " + e.getMessage());
        }
    }
}

package TP3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {
        String fichierEntree = "src/TP3/src/in.txt";
        String fichierSortie = "src/TP3/src/out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fichierEntree));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fichierSortie))) {

            String ligne;
            while ((ligne = reader.readLine()) != null) {
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println("Copie du fichier termine avec succes.");

        } catch (IOException e) {
            System.err.println("erreur lors de la copie du fichier : " + e.getMessage());
        }
    }
}

package TP3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        String fileName = "src/TP3/src/in.txt";
            int lineNumber = 1;
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                String line;
                while ((line = br.readLine()) !=  null){
                    System.out.println("ligne " + lineNumber + " : " + line);
                    lineNumber++;
                }
            }  catch (IOException e) {
                System.err.println("error de lecture du fichier " + fileName + ".");
                e.printStackTrace();
            }

        /*try {
            // Lecture du fichier
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
            // Initialisation des compteurs
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            Map<String, Integer> wordOccurrencesWholeFile = new HashMap<>();

            // Parcourir chaque ligne du fichier
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Compter le nombre de caractères dans la ligne
                charCount += line.length();

                // Compter le nombre de mots dans la ligne et mettre à jour les occurrences de chaque mot
                String[] words = line.split("\\s+");
                int lineWordCount = words.length;
                wordCount += lineWordCount;

                // Mettre à jour les occurrences de chaque mot dans le fichier
                Map<String, Integer> wordOccurrencesLine = new HashMap<>();
                for (String word : words) {
                    wordOccurrencesWholeFile.put(word, wordOccurrencesWholeFile.getOrDefault(word, 0) + 1);
                    wordOccurrencesLine.put(word, wordOccurrencesLine.getOrDefault(word, 0) + 1);
                }

                // Afficher le nombre de mots dans la ligne et les occurrences de chaque mot dans cette ligne
                System.out.println("Ligne " + lineCount + " a " + lineWordCount + " mot(s) avec les occurrences:");
                for (Map.Entry<String, Integer> entry : wordOccurrencesLine.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }

            // Fermer le lecteur
            reader.close();

            // Affichage des résultats globaux
            System.out.println("Nombre total de lignes: " + lineCount);
            System.out.println("Nombre total de mots: " + wordCount);
            System.out.println("Nombre total de caractères: " + charCount);

            // Affichage du nombre d'occurrences de chaque mot dans le fichier
            System.out.println("Occurrences des mots dans le fichier:");
            for (Map.Entry<String, Integer> entry : wordOccurrencesWholeFile.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

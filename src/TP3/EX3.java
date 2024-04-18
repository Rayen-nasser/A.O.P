package TP3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class EX3 {
    public static void main(String[] args) {
        String fileName = "src/TP3/src/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int numLines = 0;
            int numWords = 0;
            int numChars = 0;
            Map<String, Integer> wordOccurrences = new HashMap<>();

            String line;
            while ((line = br.readLine()) != null) {
                numLines++;
                numChars += line.length();

                StringTokenizer tokenizer = new StringTokenizer(line);
                numWords += tokenizer.countTokens();

                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
                }
            }

            System.out.println("nombre de lignes : " + numLines);
            System.out.println("nombre de mots : " + numWords);
            System.out.println("nombre de caracteres : " + numChars);

            System.out.println("\nOccurrences des mots : ");
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("erreur de lecture du fichier : " + e.getMessage());
        }
    }

}

package TP3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/TP3/src/in.txt"))) {
            Scanner scanner = new Scanner(System.in);
            boolean isAuthenticated = false;

            System.out.print("Login : ");
            String inputLogin = scanner.nextLine();
            System.out.print("Mot de passe : ");
            String inputPassword = scanner.nextLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("/");
                String login = parts[0];
                String password = parts[1];

                if (login.equals(inputLogin) && password.equals(inputPassword)) {
                    isAuthenticated = true;
                    break;
                }
            }

            if (isAuthenticated) {
                System.out.println("Authentification réussie !");
            } else {
                System.out.println("PB Authentification : Login ou mot de passe incorrect.");
            }
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
    }
}

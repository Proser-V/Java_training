package mypackage;
import java.io.*;
import java.util.*;

/**
 * Lectrue de saisie au clavier:
 * BufferedReader -> synchrone
 *                   thread-safe
 *                   lectur de chaine de caractères
 *            - read(): lire un caractère
 *            - readLine(): lire une str
 *            - skip(N): ignore N caractères
 * 
 * Scanner -> asynchrone
 *            thread-safe
 *            lecture de données (pas seulement str) + parsing
 *            tampon de 1024 caractères
 *            plus lent que BufferReader (asynchrone + tous types de données + parsing)
 *               - nextLine()
 *               - nextChar()
 *               - nextByte()
 *               - nextFloat()
 *               - nextDouble()
 *               - nextInt()
 *               - nextBoolean()
 */

public class Player {
    String name;
    int playerAge;

    private Player(String name, int age) {
        this.name = name;
        this.playerAge = age;
    }

    public static Player createFromInput() {
        Scanner scan = new Scanner(System.in);
        String playerName = "";
        int playerAge = 0;

        // === Nom du joueur ===
        while(true){
        System.out.print("Quel est ton nom, chevalier ? ");
        playerName = scan.nextLine();

        if (!playerName.matches("[a-zA-ZÀ-ÿ\\-\\s]+")) {
            System.out.println("Erreur : Nom de joueur invalide.");
            continue;
        }
        else {
            break;
        }
        }
        // === Âge du joueur ===
        while(true){
        System.out.print("Quel est ton âge ? ");
            try {
                playerAge = scan.nextInt();
                scan.nextLine();

                if (playerAge <= 0) {
                    System.out.println("Erreur : L'âge doit être positif.");
                    continue;
                }
                break; // entrée valide, on sort de la boucle
            } 
            catch (InputMismatchException e) {
                System.out.println("Erreur : Saisie non valide, entre un entier.");
                scan.nextLine();
    }
            }
    System.out.println("Bienvenue dans le monde de Bloublibla, chevalier " + playerName + " !");
    System.out.println("Tu as pu atteindre le vénérable âge de " + playerAge + " ans...");
    return new Player(playerName, playerAge);
    }
}

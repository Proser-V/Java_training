//First approach of java

/**
 * Notations :
 * integer : 146
 *           18_666
 *           1_000_000_000
 * bases numériques: décimale     (10 -> 0 to 9) -> 1455
 *                   binaire      (2  -> 0 to 1) -> 0b01101101
 *                   octale       (8  -> 0 to 7) -> 0755
 *                   hexadécimale (16 -> 0 to F) -> 0xAF55
 */

public class MainApp
{
    public static void main(String[] args)
    {
        final String myName = "Proser-V";
        int myAge = 35;
        final String myTaste = "I love coding with java !";
        System.out.println("Hello world!" + " I'm " + myName + ". I'm " + myAge + ", and " + myTaste);

        System.out.println("I'm now playing with cats :");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
    }
}
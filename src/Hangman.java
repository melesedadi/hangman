import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String[] Hangman = new String[10];
        Hangman[0] = "tree";
        Hangman[1] = "rain";
        Hangman[2] = "bear";
        Hangman[3] = "encourage";
        Hangman[4] = "promise";
        Hangman[5] = "soup";
        Hangman[6] = "chess";
        Hangman[7] = "insurance";
        Hangman[8] = "pancakes";
        Hangman[9] = "stream";
        String wordguess, letterguess = " ";
        Random rand = new Random();
        boolean won = false;
        int guessnum = 6;

        for (int i = 0; i < Hangman.length; i++) {
            for (int j = 1; j <= guessnum; j++) {
                System.out.println("Enter a letter to gues a word: ");
                letterguess = key.nextLine();
                if (letterguess.contains(Hangman[i])) {
                    System.out.println("You won!");
                    System.out.println("End of the Game");
                    break;
                } else if (!letterguess.contains(Hangman[i])) {
                    System.out.println("Your word guess is " + letterguess);
                    System.out.println("You did not won!");
                    j++;
                    System.out.println("Your guess number is " + j);
                    System.out.println("Your remaining guess number is " + (guessnum - j));


                }


            }
        }
    }
}

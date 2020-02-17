package ScrabbleCalculator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a word for a scrabble calculation:");
        String userInput = input.nextLine();

        ScrabbleWordCalculator newWord = new ScrabbleWordCalculator(userInput);
        newWord.wordCheckCalculator();
        newWord.printScore();

    }
}

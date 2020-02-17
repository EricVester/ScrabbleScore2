package ScrabbleCalculator;

import java.util.ArrayList;
import java.util.List;

public class ScrabbleWordCalculator {

    private int totalScore;
    private String word;

    public ScrabbleWordCalculator(String word)
    {
        this.totalScore = totalScore;
        this.word = word;
    }

    public int wordCheckCalculator()
    {
        String upperCaseWord = word.toUpperCase();

        for (int i = 0; i < upperCaseWord.length(); i++)
        {
            char letter = upperCaseWord.charAt(i);

            if ((letter =='A'|| letter =='E'|| (letter == 'I') || (letter == 'O') || (letter == 'U') || (letter == 'L') || (letter == 'N') || (letter == 'R') || (letter == 'S') || (letter == 'T')))
            {
                totalScore += 1;
            }

            if (letter =='G' || letter =='D')
            {
                totalScore += 2;
            }

            if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P')
            {
                totalScore += 3;
            }
            if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y')
            {
                totalScore += 4;
            }
            if (letter == 'K')
            {
                totalScore += 5;
            }
            if (letter == 'J' || letter == 'X')
            {
                totalScore += 8;
            }
            if (letter == 'Q' || letter == 'Z')
            {
                totalScore += 10;
            }

        }
        return(totalScore);
    }

    public void printScore()
    {
        System.out.println("Your total score is for '" + word + "': " + totalScore);
    }
}

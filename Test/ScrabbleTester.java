import ScrabbleCalculator.ScrabbleWordCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class ScrabbleTester {

    @Test
    void normalWord(){
        ScrabbleWordCalculator normalWord = new ScrabbleWordCalculator("twitch");
        assertEquals(14, normalWord.wordCheckCalculator());

    }

    @Test
    void calcScrabbleWordLong()
    {
        ScrabbleWordCalculator longWord = new ScrabbleWordCalculator("Impedimenta");
        assertEquals(18, longWord.wordCheckCalculator());
    }

    @Test
    void calcScrabbleWordShort()
    {
        ScrabbleWordCalculator shortWord = new ScrabbleWordCalculator("The");
        assertEquals(6, shortWord.wordCheckCalculator());
    }

    @Test
    void calcScrabbleWordSingleLetter()
    {
        ScrabbleWordCalculator singleLetter = new ScrabbleWordCalculator("A");
        assertEquals(1, singleLetter.wordCheckCalculator());
    }

    @Test
    void calcScrabbleWordHyphen()
    {
        ScrabbleWordCalculator hyphenWord = new ScrabbleWordCalculator("Sugar-free");
        assertEquals(13, hyphenWord.wordCheckCalculator());
    }

    @Test
    void calcScrabbleWordSpace()
    {
        ScrabbleWordCalculator spaceWord = new ScrabbleWordCalculator("Sugar free");
        assertEquals(13, spaceWord.wordCheckCalculator());
    }

    @Test
    void calcScrabbleWordUpperCase()
    {
        ScrabbleWordCalculator extremelyLongWorduc = new ScrabbleWordCalculator("IMPEDIMENTA");
        assertEquals(18, extremelyLongWorduc.wordCheckCalculator());
    }

    @Test
    void calcScrabbleWordLowerCase()
    {
        ScrabbleWordCalculator extremelyLongWordlc = new ScrabbleWordCalculator("impedimenta");
        assertEquals(18, extremelyLongWordlc.wordCheckCalculator());
    }





}

package ScrabbleCalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    String Letter ;
    Double letterValue;
    List<String> Values1 = List.of("A","E","I","O","U","L","N","R","S","T");
    List<String>  Values2 = List.of("G","D");
    List<String>  Values3 = List.of("B","C","M","P");
    List<String> Values4 = List.of("F","H","V","W","Y");
    List<String> Values5 = List.of("K");
    List<String> Values8 = List.of("J","X");
    List<String> Values10 = List.of("Q","Z");


    public Calculation(String letter, Double letterValue) {
        Letter = Letter;
        this.letterValue = letterValue;

    }

    public char getLetter(){
        return Letter.charAt(1);

     }


    public static void main(String[] args) {

    }
}

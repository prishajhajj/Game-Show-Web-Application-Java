package sheridan.jhajjpr.assignment1;

import static java.lang.System.out;
import static java.util.Collection.*;

import java.util.Random;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import sheridan.jhajjpr.assignment1.PrizeSelection;


public class Main {
    public static void main(String[] args) {

        PlayGame obj = new PlayGame(new Random());

        String[] prizes = {"Two Tickets to Florida", "KITKAT Chocolate Bar", "$500 Cheque"};
        List<String> prizeslist = Arrays.asList((prizes));
        System.out.println("Prize list");

        for (String val : prizeslist) {
            System.out.println(val + " ");
        }

        System.out.println("Shuffled Prize list");
        Collections.shuffle(prizeslist);
        System.out.println(prizeslist);


    }
}

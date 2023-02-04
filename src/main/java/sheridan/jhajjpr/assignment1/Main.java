package sheridan.jhajjpr.assignment1;

import static java.lang.System.out;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        PlayGame obj = new PlayGame(new Random());

        out.println("random number: " + obj.valueGenerator());
        out.println(obj.result());


    }

}

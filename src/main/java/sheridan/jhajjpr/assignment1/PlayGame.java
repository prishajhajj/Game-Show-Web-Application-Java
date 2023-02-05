package sheridan.jhajjpr.assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static java.lang.System.out;
import java.util.List;
import java.util.Random;


public class PlayGame {

    private final Random random;

    public PlayGame(Random random) {
        this.random = random;
    }

}

package sheridan.jhajjpr.assignment1.model;

public class PrizeSelection {

    private final PlayerChoice playeroneChoice;

    private final PlayerChoice playertwoChoice;

    private final PlayerChoice playerthreeChoice;

    private final GameResult gameResult;

    public PlayerChoice getPlayeroneChoice() {
        return playeroneChoice;
    }

    public PlayerChoice getPlayertwoChoice() {
        return playertwoChoice;
    }

    public PlayerChoice getPlayerthreeChoice() {
        return playerthreeChoice;
    }

    public GameResult getGameResult( ) {
        return gameResult;
    }

    private static GameResult getGameResult(PlayerChoice playeroneChoice, PlayerChoice playertwoChoice, PlayerChoice playerthreeChoice) {
        switch(playeroneChoice) {
            case BOX1:
                return GameResult.TICKETS;

            case BOX2:
                return GameResult.CANDY;

            case BOX3:
                return GameResult.CHEQUE;
        }
        switch(playertwoChoice) {
            case BOX1:
                return GameResult.CANDY;

            case BOX2:
                return GameResult.CHEQUE;

            case BOX3:
                return GameResult.TICKETS;
        }
        switch(playerthreeChoice) {
            case BOX1:
                return GameResult.CHEQUE;

            case BOX2:
                return GameResult.TICKETS;

            case BOX3:
                return GameResult.CANDY;
        }
        throw new AssertionError("should never be reached");
    }



    }





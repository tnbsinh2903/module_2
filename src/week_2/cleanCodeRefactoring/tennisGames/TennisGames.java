package week_2.cleanCodeRefactoring.tennisGames;

public class TennisGames {
    public static final String Love_all = "love_All";
    public static final String Fifteen_all = "Fifteen_All";
    public static final String Thirty_all = "Thirty_All";
    public static final String Forty_all = "Forty_All";
    public static final String Deuce = "Deuce";
    public static final String Love = "Love";
    public static final String Fifteen = "Fifteen";
    public static final String Thirty = "Thirty";
    public static final String Forty = "Forty";

    public static String getScore(String playerName1, String playerName2, int scorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = new StringBuilder(Love_all);
                    break;
                case 1:
                    score = new StringBuilder(Fifteen_all);
                    break;
                case 2:
                    score = new StringBuilder(Thirty_all);
                    break;
                case 3:
                    score = new StringBuilder(Forty_all);
                    break;
                case 4:
                    score = new StringBuilder(Deuce);
                    break;
            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minesResult = scorePlayer1 - scorePlayer2;
            if (minesResult == 1) score = new StringBuilder("Advntage play1: " + playerName1);
            else if (minesResult == -1) score = new StringBuilder("Advantage player2: " + playerName2);
            else if (minesResult >= 2) score = new StringBuilder("win for player: " + playerName1);
            else score = new StringBuilder("win for player: " + scorePlayer2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score.append("-");
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score.append(Love);
                        break;
                    case 1:
                        score.append(Fifteen);
                        break;
                    case 2:
                        score.append(Thirty);
                        break;
                    case 3:
                        score.append(Forty);
                        break;
                }
            }
        }
        return score.toString();
    }
}







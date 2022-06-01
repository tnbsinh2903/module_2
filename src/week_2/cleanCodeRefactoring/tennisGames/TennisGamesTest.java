package week_2.cleanCodeRefactoring.tennisGames;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class TennisGamesTest {
    private int player1Score;
    private int player2Score;

    public TennisGamesTest(int player1Score, int player2Score){
    this.player1Score = player1Score;
    this.player2Score = player2Score;
    }


    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int m_score1 = 0;
        int m_score2 = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                m_score1 += 1;
            if (i < this.player2Score)
                m_score2 += 1;
        }

}}
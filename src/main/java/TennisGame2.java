
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] scoreNames = { "Love", "Fifteen", "Thirty", "Forty" };
        String score;

        if (P1point == P2point) {
            if (P1point < 3) {
                score = scoreNames[P1point] + "-All";
            } else {
                score = "Deuce";
            }
        } else if (P1point >= 4 || P2point >= 4) {
            int scoreDifference = P1point - P2point;
            if (scoreDifference == 1) {
                score = "Advantage " + player1Name;
            } else if (scoreDifference == -1) {
                score = "Advantage " + player2Name;
            } else if (scoreDifference >= 2) {
                score = "Win for " + player1Name;
            } else {
                score = "Win for " + player2Name;
            }
        } else {
            score = scoreNames[P1point] + "-" + scoreNames[P2point];
        }

        return score;
    }

    public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            P1Score();
        }

    }

    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
            P2Score();
        }

    }

    public void P1Score(){
        P1point++;
    }

    public void P2Score(){
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}
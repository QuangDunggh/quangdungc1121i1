package com.cleanCode;

public class TennisGame  {
    static final int isZero = 0;
    static final int isFifteen = 15;
    static final int isThirty = 30;
    static final int isForty = 40;
    public static final int isTempTwentyFive = 25;
    public static final int isTempForty = 40;
    public static final int isTempTen = 10;
    public static final int isTempSixty = 60;
    public static final int isTempFortyFive = 45;
    public static final int isTempTwenty = 20;

    public static void main(String[] args) {
        System.out.println(getScore( 50, 60));
    }

    public static String getScore( int playerScore1, int playerScore2) {
        StringBuilder score = new StringBuilder();
        if (playerScore1 == playerScore2) {
            score = isEqual(playerScore1);
        } else {
            score = isWin(playerScore1, playerScore2, score);
        }
        return score.toString();
    }

    private static StringBuilder isWin(int playerScore1, int playerScore2, StringBuilder score) {
        int tempScore;
        boolean isPlayerScore1MoreThanFour = playerScore1 <= 40;
        boolean isPlayerScore2MoreThanFour = playerScore2 <= 40;
        if (isPlayerScore1MoreThanFour || isPlayerScore2MoreThanFour) {
            int minusResult = playerScore1 - playerScore2;
            switch (minusResult) {
                case isTempTen:
                case isFifteen:
                case isTempTwentyFive:
                case isTempForty:
                    score = new StringBuilder("Advantage player1");
                    break;
                case -isTempTen:
                case -isFifteen:
                case -isTempTwentyFive:
                case -isTempForty:
                    score = new StringBuilder("Advantage player2");
                    break;
                case isTempSixty:
                case isTempFortyFive:
                case isThirty:
                case isTempTwenty:
                    score = new StringBuilder("Win for player1");
                    break;
                case -isTempSixty:
                case -isTempFortyFive:
                case -isThirty:
                case -isTempTwenty:
                    score = new StringBuilder("Win for player2");
                    break;
            }
        } else {
            score = new StringBuilder("Deuce");
        }
        return score;
    }

    private static StringBuilder isEqual(int playerScore1) {
        StringBuilder score;
        switch (playerScore1) {
            case isZero:
                score = new StringBuilder("Love-All");
                break;
            case isFifteen:
                score = new StringBuilder("Fifteen-All");
                break;
            case isThirty:
                score = new StringBuilder("Thirty-All");
                break;
            case isForty:
                score = new StringBuilder("Forty-All");
                break;
            default:
                score = new StringBuilder("Deuce");
                break;
        }
        return score;
    }
}

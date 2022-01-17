package com.cleanCode;

public class TennisGame2 {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final int SCOREZERO = 0;
    public static final int SCORESTART = 1;
    public static final int SCORETHREE = 3;
    public static final int TEMPSCORE = 2;
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int SCOREFINAL = 4;
    public static final String WIN_FOR_PLAYER_1 = "Win for Player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for Player2";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        boolean isEquals = scorePlayer1 == scorePlayer2;
        if (isEquals) {
            score = getDraw(scorePlayer1);
        } else if (scorePlayer1 >= SCOREFINAL || scorePlayer2 >= SCOREFINAL) {
            score = getAdvantage(scorePlayer1, scorePlayer2);
        } else {
            score = getReadScore(scorePlayer1, scorePlayer2, score);
        }
        return score;
    }


    private static String getReadScore(int scorePlayer1, int scorePlayer2, String score) {
        int tempScore = 0;
        for (int i = SCORESTART; i < SCORETHREE; i++) {
            if (i == SCORESTART) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case SCOREZERO:
                    score += LOVE;
                    break;
                case SCORESTART:
                    score += FIFTEEN;
                    break;
                case TEMPSCORE:
                    score += THIRTY;
                    break;
                case SCORETHREE:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    private static String getAdvantage(int scorePlayer1, int scorePlayer2) {
        String score = " ";
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == SCORESTART) score = ADVANTAGE_PLAYER_1;
        else if (minusResult == -SCORESTART) score = ADVANTAGE_PLAYER_2;
        else if (minusResult >= TEMPSCORE) score = WIN_FOR_PLAYER_1;
        else score = WIN_FOR_PLAYER_2;
        return score;
    }

    private static String getDraw(int scorePlayer) {
        String score;
        switch (scorePlayer) {
            case SCOREZERO:
                score = LOVE_ALL;
                break;
            case SCORESTART:
                score = FIFTEEN_ALL;
                break;
            case TEMPSCORE:
                score = THIRTY_ALL;
                break;
            case SCORETHREE:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
        return score;
    }
}

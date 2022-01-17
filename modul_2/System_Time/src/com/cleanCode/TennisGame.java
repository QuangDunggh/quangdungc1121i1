package com.cleanCode;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final int scoreEnd = 4;
    public static final int scoreStart = 1;
    public static final int tempScore = 2;
    public static final int scoreThree = 3;
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int scoreZero = 0;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = scoreZero;
        boolean isEquals = scorePlayer1 == scorePlayer2;
        if (isEquals) {
            score = getDraw(scorePlayer1);
        } else if (scorePlayer1 >= scoreEnd || scorePlayer2 >= scoreEnd) {
            score = getWin(scorePlayer1, scorePlayer2);
        } else {
            score = getReadScore(scorePlayer1, scorePlayer2, score);
        }
        return score;
    }

    private static String getReadScore(int scorePlayer1, int scorePlayer2, String score) {
        int tempScore = scoreZero;
        for (int i = scoreStart; i < scoreThree; i++) {
            if (i == scoreStart) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case scoreZero:
                    score += LOVE;
                    break;
                case scoreStart:
                    score += FIFTEEN;
                    break;
                case TennisGame.tempScore:
                    score += THIRTY;
                    break;
                case scoreThree:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    private static String getWin(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == scoreStart) score = "Advantage player1";
        else if (minusResult == -scoreStart) score = "Advantage player2";
        else if (minusResult >= TennisGame.tempScore) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getDraw(int score) {
        String result;
        switch (score) {
            case scoreZero:
                result = LOVE_ALL;
                break;
            case scoreStart:
                result = FIFTEEN_ALL;
                break;
            case TennisGame.tempScore:
                result = THIRTY_ALL;
                break;
            case scoreThree:
                result = FORTY_ALL;
                break;
            default:
                result = DEUCE;
                break;

        }
        return result;
    }
}

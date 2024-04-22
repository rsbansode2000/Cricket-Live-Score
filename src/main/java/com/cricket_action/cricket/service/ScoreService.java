package com.cricket_action.cricket.service;

import org.springframework.stereotype.Service;

import com.cricket_action.cricket.entity.RawScore;
import com.cricket_action.cricket.entity.Score;

@Service
public class ScoreService {

    // public String getBallDetails(RawScore rawScore){

    // return rawScore.toString();
    // }

    public String saveBallDetails(RawScore rawScore) {

        int over = rawScore.getOver();
        int ball = rawScore.getBall();
        String batsman = rawScore.getBatsman();
        String boller = rawScore.getBoller();
        int batsmanRun = 0;
        int extraRun = 0;
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int six = 0;
        String delivery = rawScore.getDelivery();
        int totalRun = 0;
        String commentry = rawScore.getCommentry();

        if (rawScore.getDelivery().equals("Leagel")) {
            batsmanRun = rawScore.getRun();
        } else {
            batsmanRun = rawScore.getRun();
            extraRun = 1;
        }

        switch (rawScore.getRun()) {
            case 0:
                zero = 1;
                break;
            case 1:
                one = 1;
                break;
            case 2:
                two = 1;
                break;
            case 3:
                three = 1;
                break;
            case 4:
                four = 1;
                break;
            case 6:
                six = 1;
                break;
        }

        totalRun = batsmanRun + extraRun;

        Score score = new Score(over, ball, batsman, boller, rawScore.getRun(), batsmanRun, extraRun, zero,
                one, two, three, four, six, delivery, totalRun, commentry);

        return score.toString();
    }

}

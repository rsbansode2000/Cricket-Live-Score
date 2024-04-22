package com.cricket_action.cricket.entity;

public class RawScore {

    private int over;
    private int ball;
    private String batsman;
    private String boller;
    private int run;
    private String delivery;
    private String commentry;

    public RawScore(int over, int ball, String batsman, String boller, int batsmanRun, String delivery, String commentry) {
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.boller = boller;
        this.run = batsmanRun;
        this.delivery = delivery;
        this.commentry = commentry;
    }

    public RawScore(){}


    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int batsmanRun) {
        this.run = batsmanRun;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getCommentry(){
        return commentry;
    }

    public void setCommentry(String commentry){
        this.commentry = commentry;
    }

    public String getBoller() {
        return boller;
    }

    public void setBoller(String boller) {
        this.boller = boller;
    }

    @Override
    public String toString() {
        return "Score [over=" + over + ", ball=" + ball + ", batsman=" + batsman + ", boller=" + boller
                + ", Run=" + run + ", delivery=" + delivery + ", commentry=" + commentry + "]";
    }


    
}

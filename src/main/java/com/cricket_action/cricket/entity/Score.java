package com.cricket_action.cricket.entity;

public class Score {

    private int id;
    private int over;
    private int ball;
    private String batsman;
    private String boller;
    private int run;
    private int batsmanRun;
    private int extraRun;
    private int zero;
    private int one;
    private int two;
    private int three;
    private int four;
    private int six;
    private String delivery;
    private int totalRun;
    private String commentry;

    public Score(int over, int ball, String batsman, String boller, int run, int batsmanRun, int extraRun, int zero,
            int one, int two, int three, int four, int six, String delivery, int totalRun, String commentry) {
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.boller = boller;
        this.run = run;
        this.batsmanRun = batsmanRun;
        this.extraRun = extraRun;
        this.zero = zero;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.six = six;
        this.delivery = delivery;
        this.totalRun = totalRun;
        this.commentry = commentry;
    }

    public Score(){}

    public int getZero() {
        return zero;
    }

    public void setZero(int zero) {
        this.zero = zero;
    }

    public int getOver() {
        return over;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
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

    public String getBoller() {
        return boller;
    }

    public void setBoller(String boller) {
        this.boller = boller;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getBatsmanRun() {
        return batsmanRun;
    }

    public void setBatsmanRun(int batsmanRun) {
        this.batsmanRun = batsmanRun;
    }

    public int getExtraRun() {
        return extraRun;
    }

    public void setExtraRun(int extraRun) {
        this.extraRun = extraRun;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getCommentry() {
        return commentry;
    }

    public void setCommentry(String commentry) {
        this.commentry = commentry;
    }

    @Override
    public String toString() {
        return "Score [id=" + id + ", over=" + over + ", ball=" + ball + ", batsman=" + batsman + ", boller=" + boller
                + ", run=" + run + ", batsmanRun=" + batsmanRun + ", extraRun=" + extraRun + ", zero=" + zero + ", one="
                + one + ", two="
                + two + ", three=" + three + ", four=" + four + ", six=" + six + ", total Run=" + totalRun
                + ", delivery=" + delivery
                + ", commentry=" + commentry + "]";
    }

}

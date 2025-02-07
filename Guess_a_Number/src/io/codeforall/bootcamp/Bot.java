package io.codeforall.bootcamp;

public class Bot {

    private String botName;
    private String result;

    public Bot() {
        this.botName = "Judge Fudge";
    }
    public String getBotName() {
        return this.botName;
    }
    public static int getRandomNum() {
        return Dealer.randomNum();
    }





}

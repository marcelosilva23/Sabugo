package io.codeforall.bootcamp;

public class Dealer {
    private String dealerName;
    public Dealer(){
        this.dealerName = "Pablo";
    }
    public String getDealerName() {
        return this.dealerName;
    }

    public static int randomNum() {
        return (int) Math.round(Math.random() * 9 + 1);
    }
}
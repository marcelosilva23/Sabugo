package io.codeforall.bootcamp;

public class Player {

    public String playerName;
    private int number;

    public Player(String playerName){
        this.playerName = playerName;
    }

    public static int getRandomNum() {
        return Dealer.randomNum();
    }
}

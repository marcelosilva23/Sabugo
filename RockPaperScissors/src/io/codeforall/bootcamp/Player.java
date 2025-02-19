package io.codeforall.bootcamp;

public class Player {

    private String name;
    private Hand hand;


    public Player(String name){
        this.name = name;
    }

    public String getName() { return name; }

    public Hand getHand() { return hand; }

    public Hand generateHand() {
        return hand = Hand.values() [(int) Math.round(Math.random() * 2)];
    }




}

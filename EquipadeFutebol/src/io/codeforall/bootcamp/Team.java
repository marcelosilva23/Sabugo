package io.codeforall.bootcamp;

import java.awt.*;

public class Team {

    private String color;
    private String name;
    private String stadiumName;
    private String mascot;
    private int players;
    private int fans;

    public Team(String color, String name, String stadiumName, String mascot, int players, int fans) {
        this.color = color;
        this.name = name;
        this.stadiumName = stadiumName;
        this.players = players;
        this.fans = fans;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color != "Blue" && color != "Green" && color != "Red" && color != "Pink") {
            System.out.println("Are you serious? Try another one");
        } else {
            System.out.println("That's look fancy!");
            this.color = color;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public String getStadiumName() {
        return this.stadiumName;
    }

    public void setStadiumName() {
        this.stadiumName = stadiumName;
    }

    public String getMascot() {
        return this.mascot;
    }

    public void setMascot() {
        this.mascot = mascot;
    }

    public void setPlayers() {
        this.players = players;
    }

    public int getPlayers() {
        return this.players;
    }

    public void setFans() {
        this.fans = fans;
    }

    public int getFans() {
        return this.fans;
    }

}

package io.codeforall.kernelfc;

public class ArmouredEnemy extends Enemy {

    private int armour = 20;

    public int getArmour() {
        return armour;
    }

    public void hit(int damage) {
    }

    @Override
    public String toString() {
        return "ArmouredEnemy{" +
                "armour=" + armour +
                '}';
    }
}

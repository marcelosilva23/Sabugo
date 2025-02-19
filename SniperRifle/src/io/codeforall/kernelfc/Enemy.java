package io.codeforall.kernelfc;

public abstract class Enemy extends GameObject {

    private int health = 20;
    private boolean isDead = false;
    private Enemy[] enemies;




    public void MedicalStatus(Enemy[] enemies) {
        this.enemies = enemies;
    }

    public boolean wasShot(Enemy enemy) {

        for (Enemy e : enemies) {

            if (health == 0) {
                isDead = true;
                return isDead;
            }
        }
        return false;
    }


    public void hit(int damage) {
        health = health - 1;

    }




    @Override
    public void getMessage() {
        System.out.println("hello, I'm a enemy!");
    }
}
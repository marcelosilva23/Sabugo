package io.codeforall.kernelfc;

public class Game {

    public static final int MAX_OBJECTS = 5;

    private GameObject[] gameObjects;

    SniperRifle sniperRifle = new SniperRifle();

    private int shotsFired;

    public Game() {
        start();
    }


    public void createObjects() {
        gameObjects = new GameObject[MAX_OBJECTS];

        for (int i = 0; i < gameObjects.length; i++) {
            gameObjects[i] = GameObjectsFactory.createGameObjects();
        }
    }
    public void start() {
        createObjects();
        for (int i = 0; i < Game.MAX_OBJECTS; i++) {
            if (gameObjects.equals(TypeOfObjects.TREE)){
                System.out.println("I'm groot!");
                continue;
            }
            sniperRifle.shoot(gameObjects[i]);
        }
    }

    /*public void setShotsFired() {
        shotsFired = sniperRifle.shoot;
        this.shotsFired = shotsFired;
    }*/





}


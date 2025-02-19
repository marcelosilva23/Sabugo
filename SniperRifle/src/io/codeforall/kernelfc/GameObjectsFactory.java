package io.codeforall.kernelfc;

public class GameObjectsFactory {

    public static GameObject createGameObjects(){
        int random = (int) (Math.random() * TypeOfObjects.values().length);
        TypeOfObjects typeOfObjects = TypeOfObjects.values()[random];

        GameObject gameObject;

        switch (typeOfObjects) {
            case ARMOURED:
                gameObject = new ArmouredEnemy();
                break;
            case SOLDIER:
                gameObject = new SoldierEnemy();
                break;
            case TREE:
                gameObject = new Tree();
            default:
                gameObject = new ArmouredEnemy();
        }
        return  gameObject;
    }



}

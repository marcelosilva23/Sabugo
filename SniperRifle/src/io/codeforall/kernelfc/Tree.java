package io.codeforall.kernelfc;

public class Tree extends GameObject {


    public void hit(int damage) {
    }

    @Override
    public void getMessage() {
        System.out.println("I'm Groot! I dare you to shoot.");
    }

    @Override
    public String toString() {
        return "I'm groot!";
    }
}

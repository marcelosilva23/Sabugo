package io.codeforall.kernelfc;

public class SniperRifle {

    private int bulletDamage = 20;
    private int shots[];
    private boolean miss = true;
    private final float HIT_PROB = 0.4f;

    public void shoot(GameObject target) {

        for(int i = 0; i < Game.MAX_OBJECTS; i++) {



            if (Math.random() < HIT_PROB) {

                target.hit(bulletDamage);

                System.out.println("It's a hit!");

            } else {

                System.out.println("It's a miss!");

            }
        }
    }



}

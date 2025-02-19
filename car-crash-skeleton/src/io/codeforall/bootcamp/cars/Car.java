package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Direction;
import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

import java.security.PublicKey;

abstract public class Car {
    /**
     * The position of the car on the grid
     */
    private Position pos;
    private Direction direction;

    public Car() {
        // new Car();
        pos = new Position();
        setDirection();
        System.out.println(this.getClass().getSimpleName());
        System.out.println(pos);

    }

    public Direction setDirection() {
        direction = Direction.values() [(int) Math.round(Math.random() * 3)];
        System.out.println(direction);
        return direction;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos() {
        pos.move();
    }

    public boolean isCrashed() {
        return false;
    }


    @Override
    public String toString() {
        return "F";
    }


    }

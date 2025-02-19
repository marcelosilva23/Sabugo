package io.codeforall.bootcamp.field;

import io.codeforall.bootcamp.cars.Car;

public class Position {

    private int col;
    private int row;

    public Position(){

        row = (int) (Math.random() * Field.getHeight());
        System.out.println("POSITION CONSTRUCTOR - Field.getHeight():" + Field.getHeight());
        System.out.println(col);
        col = (int) (Math.random() * Field.getWidth());
        System.out.println(row);
    }
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int move(){
        System.out.println(" ============== " + row);
        return row++;
    }


    public int moveHorizontal() {

return col;
    }

    public int moveVertical() {
return 0;
    }

    @Override
    public String toString() {
        return "Position{" +
                "col=" + col +
                ", row=" + row +
                '}';
    }
}

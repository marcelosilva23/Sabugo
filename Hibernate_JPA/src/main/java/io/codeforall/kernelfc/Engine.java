package io.codeforall.kernelfc;

import javax.persistence.Embeddable;

@Embeddable
public class Engine {

    private String type;
    private int horsepower;
    private double displacement;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}

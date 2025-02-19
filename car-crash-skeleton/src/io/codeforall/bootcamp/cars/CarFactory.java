package io.codeforall.bootcamp.cars;

public class CarFactory {

    public static  Car getNewCar() {
        return new Fiat();
    }

    public static Car getNewMustang() {
        return new Mustang();
    }
}

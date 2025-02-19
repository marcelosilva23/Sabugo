package io.codeforall.kernelfc;

public class Playground {
    public static void main(String[] args) {

    Hotel hotel1 = new Hotel("FourSeasons", 500);
        System.out.println(hotel1.getTotalRooms());
        System.out.println(hotel1.getName());

        Guest guest1 = new Guest("Joaquim", hotel1);
        Guest guest2 = new Guest("zezoca", hotel1);
        Guest guest3 = new Guest("Maria",hotel1);

        guest1.checkIn();
        guest2.checkIn();
        //guest3.checkIn();

    }
}

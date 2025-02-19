package io.codeforall.kernelfc;

public class Guest {

    private String name;
    private Hotel hotel;
    private boolean check;
    private static int roomNum;


    public Guest(String name, Hotel hotel) {
        this.name = name;
        this.hotel = hotel;
        this.check = check;
    }
    public static int getRoomNum(){
        return roomNum;
    }

    public static int setRoomNum(){
        return roomNum;
    }

    public boolean getCheck() {
        return this.check;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void checkIn(){
        hotel.checkIn();
    }
}


package io.codeforall.kernelfc;

public class Hotel {

    private String name;
    private int totalRooms;
    private Room[] rooms;

    public Hotel(String name, int totalRooms) {
        if (totalRooms <= 5) {
            System.out.println("Insert a valid number of rooms!");
        } else {
            this.name = name;
            this.totalRooms = totalRooms;
            this.rooms = new Room[totalRooms];
        }
    }

    public String getName() {
        return this.name;
    }

    public int getTotalRooms() {
        return this.totalRooms;
    }

    public Room[] getRooms() {
        return this.rooms;
    }

    public void checkIn() {
        for (int i = 0; i < rooms.length; i++){

           if (rooms[i] == null) {
               rooms[i] = new Room();
               rooms[i].changeAvailability();
               int roomNum = i;
               System.out.println(roomNum);
               System.out.println("Welcome to " + getName() + "! Here's your key." + " Have a nice stay!");
           break;
           } else if (rooms != null){
               System.out.println("Sorry, we're full.");
           }


        }
    }
}





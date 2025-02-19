package io.codeforall.kernelfc;

public class Room {


    private boolean availability;


    public boolean getAvailability() {
        return availability;
    }

    public boolean changeAvailability() {
      return availability = false;
    }
}

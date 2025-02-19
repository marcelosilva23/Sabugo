package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {

        Team myTeam = new Team("Blue","Feirense","Estadio", "asd", 22, 456);

        //System.out.println(myTeam.getColor());
        myTeam.setColor("batata");
        //System.out.println(myTeam.getColor());

        myTeam.playAGame();
        otherTeam.playAGame();
    }
}

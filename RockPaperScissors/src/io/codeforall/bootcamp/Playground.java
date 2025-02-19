package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {

        Player player1 = new Player("Anacleto");
        Player player2 = new Player("Fagundes");
        Game myGame = new Game();

        if (player1.getHand() == player2.getHand()){
            System.out.println("It's a draw!");
        } else if ((player1.getHand() == Hand.PAPER && player2.getHand() == Hand.ROCK) ||
                    (player1.getHand() == Hand.ROCK && player2.getHand() == Hand.SCISSORS) ||
                    (player1.getHand() == Hand.SCISSORS && player2.getHand() == Hand.PAPER)){
            System.out.println(player1.getName() + " won 1 point");
            myGame.getPointsPlayer1();
       } else if {
            System.out.println(player2.getName() + " won 1 point");
        }
    }

}

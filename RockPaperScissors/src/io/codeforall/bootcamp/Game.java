package io.codeforall.bootcamp;

public class Game {

        public final static int RESULT = 3;
        private static int pointsPlayer1;
        private static int pointsPlayer2;
        private String winner;

        public Game() {
            this.pointsPlayer1 ++;
            this.pointsPlayer2 ++;
        }

    public int getPointsPlayer1() {
        return pointsPlayer1;
    }

    public int getPointsPlayer2(){
            return pointsPlayer2;
    }

}

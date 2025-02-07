package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Bot bot = new Bot();
        Player player = new Player("Alvaro");

        int playerNum = Player.getRandomNum();
        int botNum = Bot.getRandomNum();

        //Pablo generated number
        System.out.println(dealer.getDealerName() + " generated the number " + botNum + " to " + bot.getBotName());
        System.out.println(dealer.getDealerName() + " generated the number " + playerNum + " to " + player.playerName);

        while (playerNum != botNum) {
                playerNum = Player.getRandomNum();
                System.out.println("Mission failed, try again! \n" + dealer.getDealerName() + " generated the number " + playerNum + " to " + player.playerName);
        }

        if (playerNum == botNum){
                System.out.println("!!SUCCESS!!");

        }

    }
}

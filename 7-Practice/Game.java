import java.util.Random;
public class Game{
    private static int cost = 15;
    static Random reward = new Random();
    public static void play(Card card){
        card.setCredits(card.getCredits() - cost);
        card.setTickets(card.getTickets() + reward.nextInt(0,1001));
    }
}
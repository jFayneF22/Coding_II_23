public class ArcadeTest{
    public static void main(String[] args){
        Card card1 = new Card(1, 100);
        Card card2 = new Card(2, 100);
        card1.display();
        Game.play(card1);
        card1.display();
        
    }
}
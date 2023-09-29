public class Card{
    private int cardNumber;
    private int credits;
    private int tickets;
    public Card(int cardNumber, int points){
        this.cardNumber= cardNumber;
        credits = points;
        tickets = 0;
    }
    public void display(){
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Tickits: " + tickets);
    }
    public int getNum(){
        return cardNumber;
    }
    public int getCredits(){
        return credits;
    }
    public void setCredits(int num){
        credits = num;
    }
    public int getTickets(){
        return tickets;
    }
    public void setTickets(int num){
        tickets = num;
    }
}
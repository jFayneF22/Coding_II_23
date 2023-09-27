//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private static int prisonerCount = 0;
    private int bookingNumber;
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        prisonerCount++;
        bookingNumber= prisonerCount;
    }
    
    //Methods
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getSentence() {
        return sentence;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public Cell getCell() {
        return cell;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
        System.out.println("Booking Number: " + bookingNumber);
        System.out.println("Prisoners: " + prisonerCount);
    }
    public static int getPrisonerCount(){
        return prisonerCount;
    }
}
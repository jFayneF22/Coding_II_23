//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, new Cell("C3PO",false) );
        bubba.display(false);
        bubba.openDoor();
        bubba.openDoor();
    }
}

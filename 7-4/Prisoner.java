//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void displayfields(){
        System.out.println("Name: " + name);
        System.out.println("Height: "+ height);
        System.out.println("Sentence : " + sentence);
    }
    
    
    
}

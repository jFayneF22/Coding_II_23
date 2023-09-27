//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

import javax.sound.midi.Soundbank;

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    public Cell prisonCell;

    //Constructor
    public Prisoner(String name, double height, int sentence, Cell prisonCell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.prisonCell = prisonCell;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " + prisonCell.getname());
    }
}
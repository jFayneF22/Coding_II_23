public class Prison {

    public String name;
    public int sentence;
    public Double Height;
    public void setFields(String name,Double Height,int sentence){
        this.name = name;
        this.Height = Height;
        this.sentence = sentence;
    }
    public Prisoner(){
        System.out.println("This is a contructor");
    }
}
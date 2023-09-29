public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public void area(){
        System.out.println("Area: " + height*width);
    }
    public void parimeter(){
        System.out.println("Parimeter: " + (2*height) + (2*width));
    }
}

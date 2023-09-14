public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        String rectangle = "";
        //Makes top Line
        for(int i=0; i < width; i++) {
            rectangle += "*";
        }
        //Adds new line
        rectangle += "\n";
        //add inbetween spaces
        for(int i=0; i <height-2;i++){
            rectangle += "*";
            for(int k=0; k < width-2; k++){
                rectangle += " ";
            }
            rectangle += "*\n";
        }
        for(int i=0; i < width; i++) {
            rectangle += "*";
        }
        System.out.println(rectangle);
    }
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        
    }
}

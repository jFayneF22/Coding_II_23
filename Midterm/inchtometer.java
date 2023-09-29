import java.util.Scanner;
public class inchtometer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value for inches");
        int inches = sc.nextInt();
        double meters = inches * 0.0254;
        System.out.println(inches + " is equal to " + meters + " meters");
    }
}

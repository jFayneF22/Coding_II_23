import java.util.Scanner;
public class ComputeBMI {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double weight = sc.nextDouble();
    double height = sc.nextDouble();
    long BMI = Math.round((weight/(height*height))*703);
    System.out.println("Weight: " + weight);
    System.out.println("Height: " + height);
    System.out.println("BMI: " + BMI);
    sc.close();
    }
}

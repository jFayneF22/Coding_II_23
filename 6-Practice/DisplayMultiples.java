import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Choose a number");
       Double mult = sc.nextDouble();
        for(int i = 1; i <= 12; i++){
            System.out.println(mult + "x" + i + " = " + (mult*i));
        }
    }
}

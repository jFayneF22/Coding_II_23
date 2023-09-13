import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1409;
        System.out.println("Type in your pin");
        int ent = sc.nextInt();
        while(ent != pin) {
            System.out.println("The pin is incorrect. Try again");
            ent = sc.nextInt();
        }
        System.out.println("Pin Confirmed. Welcome");
    }
}

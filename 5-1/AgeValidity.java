import java.util.Scanner;

public class AgeValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in your age");
        int age = sc.nextInt();
        boolean drivingUnderAge = age <= 18;
        System.out.println("Dring under age: " + drivingUnderAge);
    }
}

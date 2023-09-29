import java.util.Scanner;
public class equality {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Intput number 1");
        int num1 = sc.nextInt();
        System.out.println("Intput number 2");
        int num2 = sc.nextInt();
        System.out.println("Intput number 3");
        int num3 = sc.nextInt();
        System.out.println("Intput number 4");
        int num4 = sc.nextInt();
        if(num1 == num2  && num2 == num3&& num3 ==num4){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}

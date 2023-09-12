import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type in 10 numbers");
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum = sum + num;

        }
        sc.close();
        System.out.println(sum);
    }
}

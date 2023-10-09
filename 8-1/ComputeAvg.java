import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double avg;
        System.out.println("Type in 5 student scores");
        for(int i = 0; i < 5; i ++){
            sum = sum + sc.nextDouble();
        }
        sc.close();
        avg = sum / 5;
        System.out.println("The class average is " + avg);

        
    }

}

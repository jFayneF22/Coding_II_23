import java.util.InputMismatchException;
import java.util.Scanner;

public class Scheduler {
    private static int coldCount = 0;

    public static boolean TempCheck() {
        boolean play;
        System.out.println("Please input temperature");
        Scanner sc = new Scanner(System.in);
        try {
            int temperature = sc.nextInt();
            sc.close();
            if (temperature <= 32) {
                play = false;
                coldCount++;
                System.out.println("Too cold to play.");
                if (coldCount >= 3) {
                    System.out.println("Season is over");
                }
            } else {
                play = true;
            }
        } catch (InputMismatchException e) {
            System.out.println("e");
            return play;
        }
    }
}

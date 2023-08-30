import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rnd = new Random();
        int result = rnd.nextInt(3);
        System.out.println(result);
    }
}

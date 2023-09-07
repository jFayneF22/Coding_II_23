import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a wavelength number.");
        double waveLength = sc.nextDouble();
        String color = "";
        sc.close();
        if (waveLength >= 380 && waveLength < 450) {
        color = "Violet";
        System.out.println("the color is: " + color);
        } else if ( waveLength >=450 && waveLength < 495) {
            color = "Blue";
            System.out.println("the color is: " + color);
        } else if (waveLength >= 495 && waveLength < 570) {
            color = "Green";
            System.out.println("the color is: " + color);
        } else if (waveLength >= 570 && waveLength < 590) {
            color = "Yellow";
            System.out.println("the color is: " + color);
        } else if (waveLength >= 590 && waveLength < 620) {
            color = "Orange";
            System.out.println("the color is: " + color);
        } else if (waveLength >= 620 && waveLength < 750) {
            color = "Red";
            System.out.println("the color is: " + color);
        } else {
            System.out.println("The entered wavelength is not part of the visible spectrum");
        }
    }
}
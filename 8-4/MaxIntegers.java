public class MaxIntegers {
    public static void main(String[] args) {
        int num1 = 7, num2 = 2, num3 = 7;
        int max = 0;
        if (num1 > max) {
            max = num1;
        } // endif
        if (num2 > max) {
            max = num2;
        } // endif
        if (num3 > max) {
            max = num3;
        } // endif
        System.out.println("The max of 3 numbers is " + max);
        int n = 10;
        int sum = 0;
        while (n >= 1) {
            sum = sum + n;
            System.out.println(sum);
            n--;
        } // end while
        System.out.println("The sum of the integers 1 to 10 is " + sum);
    }// end method
}
public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    
    public void findTotal(double price){
        double total = price*(1+tax)*(1+tip);
        System.out.println("$" +total);

    }
}

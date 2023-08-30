public class CalculatorTest4 {
    public static void main(String[] args) {
        Calculator4 calc = new Calculator4();
        double tableTotal = 0;
        //Name your friends
        tableTotal += calc.findTotal(10, "Noah");
        tableTotal += calc.findTotal(12, "Eduardo");
        tableTotal += calc.findTotal(9,  "Josaiah");
        tableTotal += calc.findTotal(8,  "Caleb");
        tableTotal += calc.findTotal(7,  "Gabe");
        tableTotal += calc.findTotal(15, "Alex");
        tableTotal += calc.findTotal(11, "Tanner");
        tableTotal += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.println("the tables total is: " + tableTotal);
    } 
}

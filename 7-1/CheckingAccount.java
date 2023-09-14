public class CheckingAccount {
    public double balance;
    public String name;
    public double interestRate;
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
    public void withdrawl(double amount) {
        if(amount > balance) {
            System.out.println("You dont have enough funds to withdraw this amount");
        } else if(amount < 0) {
            System.out.println("You can not widthdraw a negative amaount");
        } else {
            balance -= amount;
            System.out.println(balance);
        }
    }
}
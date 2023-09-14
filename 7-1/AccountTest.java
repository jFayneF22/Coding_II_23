public class AccountTest{
    public static void main(String[] args){
        CheckingAccount account = new CheckingAccount();
        account.balance = 6000;
        account.name = "Josaiah Fayne";
        account.interestRate = .15;
        account.displayCustomer();
        account.withdrawl(15);
    }
}
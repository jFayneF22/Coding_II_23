public class SavingsBond{
    public int term;
    public double interest;
    public double earnings;
    public double price;
    public SavingsBond(double userPrice, int userTerm){
        term = userTerm;
        price = userPrice;
        if(term >=0 && term <= 11){
            interest = .005;
        } else if (term >= 12 && term <=23){
            interest = 0.01;
        } else if (term >=24 && term <=35){
            interest = .015;
        } else if (term >= 36 && term <=47){
            interest = .02;
        } else if (term >= 48 && term <=60){
            interest = .025;
        }
        earnings = (price * (Math.pow((1+interest), term))) - price;
    }
    public void displaybond(){
        System.out.println("Price: " + price);
        System.out.println("Interest:" + interest);
        System.out.println("Earnings: " + earnings);
    }
}
import java.util.Scanner;
public class daysInAMonth {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month number: ");
        int monthnum = sc.nextInt();
        System.out.println("Input a year:");
        int year = sc.nextInt();
        sc.close();
        String month =" ";
        int days;
        if (monthnum%2 == 0){
            days = 30;
        }else{
            days = 31;
        }
        if(monthnum == 1){
            month = "January";
        } else if(monthnum == 2){
            month = "febuary";
            if(year%4 == 0){
                days = 29;
            }else{
                days = 28;
            }
        } else if (monthnum == 3){
            month = "March";
        }else if(monthnum == 4){
            month = "April";
        }else if(monthnum == 5){
            month = "May";
        }else if(monthnum == 6){
            month = "June";
        }else if(monthnum == 7){
            month = "July";
        }else if(monthnum == 8){
            month = "August";
        }else if (monthnum == 9){
            month = "September";
        }else if (monthnum == 10){
            month = "October";
        }else if(monthnum == 11){
            month = "November";
        }else if (monthnum == 12){
            month = "December";
        }
        System.out.println(month + " " + year + " has " + days + " days");
    }
}

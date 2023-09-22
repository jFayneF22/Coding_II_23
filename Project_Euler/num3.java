public class num3{
    public static void main(String[] args){
        long num = 0;
        long count = 1;
        while(count < 600851475143l){
            if(count%3 != 0 && count%7 !=0 && count%11 !=0){
                num = count;
                count++;
            }
        } 
        System.out.println(num);
    }
}
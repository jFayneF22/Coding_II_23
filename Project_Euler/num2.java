public class num2{
    public static void main(String[] args){
        int total = 0;
        int f_a = 1;
        int f_b = 1;
        int f_c = f_a + f_b;
        while(f_c < 4000000){
            if(f_c % 2 == 0){
                total += f_c;
            }
            f_a = f_b;
            f_b = f_c;
            f_c = f_a + f_b;
        }
        System.out.println(total);
    }
}
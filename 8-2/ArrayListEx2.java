import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(13);
        num.add(34);
        num.add(145);
        num.add(47);
        num.add(84);
        Iterator<Integer> iterator = num.iterator();
        while(iterator.hasNext()){
            int number = iterator.next();
            System.out.println(number);
            if(number%2 == 0){
                iterator.remove();
            }
        }
        System.out.println(num);
    }
}

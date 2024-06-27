import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6);
        System.out.println(numbers);
    }
}

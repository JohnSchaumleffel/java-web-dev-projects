import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        //Create ArrayList and add numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3, 5);
        System.out.println(numbers);
    }
}

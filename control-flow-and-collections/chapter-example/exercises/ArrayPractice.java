import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){

        //Integer Practice
        /*int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i : integerArray) {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }*/
        //String Practice
        String suessQuote = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them with " +
                "a mouse.";

        String[] quote = suessQuote.split("\\.");
        System.out.println(Arrays.toString(quote));

        /*for (String quote : suessQuote.split(".")) {
            System.out.println(Arrays.toString(quote));
        }*/


        //System.out.println(suessQuote);

    }
}

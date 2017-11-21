import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        int[] numbers = {1,24,67,32,9,54,2};

        int biggestNumber = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                myList.add(numbers[i]);
            }
        }

        System.out.println(myList.toString());
    }
}


import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        int[] numbers = {1,24,67,32,9,54,2};

        int biggestNumber = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                myList.add(numbers[i]);
            }
        }

        Collections.sort(myList);
        System.out.println(myList.toString());
    }
}

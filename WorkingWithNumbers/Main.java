package WorkingWithNumbers;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);
    }

}
package interview;

import java.util.HashMap;
import java.util.Map;
public class ZliczanieWystapien {

    //int[] numbers = new int[] {1,2,3,2,5,3}
    public static void main(String[] args) {
        countOccurances(new int[] {1,2,3,2,5,3,2,2,10,12});
    }

    public static void countOccurances(int[] numbers) {
        Map<Integer,Integer> occurances = new HashMap<>();

        for (int i=0; i<numbers.length; i++) {
            if (occurances.containsKey(numbers[i])) {
                Integer value = occurances.get(numbers[i]);
                occurances.put(numbers[i],value+1);
            } else {
                occurances.put(numbers[i],1);
            }
        }
        System.out.println("Result: " + occurances);

        for (Integer key : occurances.keySet()) {
            System.out.println("Liczba " + key + " występuje " + occurances.get(key));
        }
    }
}

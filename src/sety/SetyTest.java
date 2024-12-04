package sety;

import java.util.HashSet;
import java.util.Set;
public class SetyTest {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");
        System.out.println(vege);

        vege.addAll(fruits);
        System.out.println(vege);

        for(String fruit : fruits) {
            System.out.println("Print z pętli for: " + fruit);
        }
    }
}

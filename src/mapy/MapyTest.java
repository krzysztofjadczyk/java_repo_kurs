package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {

    public static void main(String[] args) {

        Map<Integer,String> students = new HashMap<>();
        students.put(1, "Basia"); //dodawanie elementu do mapy
        students.put(2, "Tomek");
        students.put(3, "Basia");

        System.out.println(students.get(1)); //Basia

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);
        System.out.println(otherStudents);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Marek"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());

        students.remove(1); //usuwanie elementu o kluczu 1
        System.out.println(students);
        System.out.println(otherStudents);

        students.put(2, "Krysia"); //nadpisuje wartość
        System.out.println(students);

        for (Integer key: students.keySet()) {
            System.out.println("Print z pętli for: " + key);
            System.out.println("Print z pętli for: " + students.get(key));
        }

        for (String student : students.values()) {
            System.out.println("Print z drugiej pętli for: " + student);
        }
    }
}

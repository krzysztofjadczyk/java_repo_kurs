import java.util.Scanner;

// porównują elementy równania i zwracają logiczną wartość (true/false)
public class OperatoryPorownania {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę a: ");
        int a = number.nextInt();
        System.out.println("Podaj drugą liczbę b: ");
        int b = number.nextInt();

        //boolean result = firstNumber > secondNumber;

        //System.out.println(result);
        System.out.println("Czy a = b? Odp: " + (a == b));
        System.out.println("Czy a != b? Odp: " + (a != b));
        System.out.println("Czy a > b? Odp: " + (a > b));
        System.out.println("Czy a < b? Odp: " + (a < b));
        System.out.println("Czy a >= b? Odp: " + (a >= b));
        System.out.println("Czy a <= b? Odp: " + (a <= b));
    }
}

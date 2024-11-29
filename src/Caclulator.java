import java.util.Scanner;

// praca domowa - napisz program, który prosi użytkownika o dwie liczby, a następnie wykonuje podstawowe operacje matematyczne na podanych wartościach
public class Caclulator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = number.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = number.nextInt();

        System.out.println("Twoje liczby to: " + firstNumber + ", " + secondNumber);

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = (float) firstNumber /secondNumber; //0,66
        int mod = secondNumber%firstNumber; //2

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Dzielenie: " + division);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Modulo: " + mod);
    }
}

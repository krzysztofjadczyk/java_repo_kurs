import java.util.Scanner;

/* zadanie domowe
    Zapytaj użytkownika o wiek. W przypadku gdy ma mniej niż 18 lat wypisz na ekranie informację, że nie może kupić alkoholu.
    Gdy ma więcej niż 18 lat to podziękuj za zakupy
 */
public class AgeChecker {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj swój wiek w latach: ");
        int age = number.nextInt();

        if (age < 18 && age >= 0) {
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age < 0) {
            System.out.println("Wprowadz poprawną wartość");
        }
        else  {
            System.out.println("Dziękuję za zakupy");

        }
    }
}

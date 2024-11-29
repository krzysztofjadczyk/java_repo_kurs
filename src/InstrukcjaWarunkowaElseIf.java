import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = number.nextInt();

        if (a > 0) {
            System.out.println("Podana liczba jest większa od 0");
        } else if (a < -10) {
            System.out.println("Podana liczba jest mniejsza od -10");

        } else if (a == 0) {
            System.out.println("Podana liczba jest równa 0");

        } else {
            System.out.println("Podana liczba jest z przedziału 0 do -10");
        }

    }
}

// instrukcje wrunkowe pozwalają nam określać, które części kodu mają zostać wykonane, gdy zostanie spełniony warunek
public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float a = 10;
        float b = 0;
        if (b!=0) {
            System.out.println("Wynik dzielenia to: " + (a/b));
        }
        else {
            System.out.println("Podaj inną liczbę różną od 0");
        }
    }
}

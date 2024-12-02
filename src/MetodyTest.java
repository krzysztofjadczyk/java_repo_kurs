public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();

       // int result = metody.policzWynik(); // błąd bo metoda void nie zwraca nic

        int result = metody.pobierzWynik();

        System.out.println("Zwócony wynik przez metodę: " + result);

        int result2 = metody.wyliczWynik(5, 6);
        System.out.println("Zwócony wynik przez metodę wyliczWynik: " + result2);

        metody.policzWynikParam(10);

    }
}

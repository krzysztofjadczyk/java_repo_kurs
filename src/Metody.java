public class Metody {

    public void policzWynik() {
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result+i;
        }
        System.out.println("Wartośc to: " + result);
    }

    public void policzWynikParam(int number) {
        int result = 0;
        System.out.println("Number ma wartość: " + number);
        for (int i=0; i<number; i++) {
            result = result+i;
        }
        System.out.println("Wartośc to: " + result);
    }

    public int pobierzWynik() {
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result+i;
        }
        //System.out.println("Wartośc to: " + result);
        return result;
    }

    public int wyliczWynik(int a, int b) {
        int result = a+b;
        //System.out.println("Wartośc to: " + result);
        return result;
    }

    public void sum() {
        int firstNumber = 0;
        int secondNumber = 2;
        System.out.println("Suma to: " + (firstNumber+secondNumber));
    }

    public String imie() {
        System.out.println("Nazywam się Tomek");
        return "Tomek";
    }
}

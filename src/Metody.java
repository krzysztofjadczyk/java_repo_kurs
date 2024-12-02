public class Metody {

    public void policzWynik() {
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result+i;
        }
        System.out.println("Wartośc to: " + result);
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

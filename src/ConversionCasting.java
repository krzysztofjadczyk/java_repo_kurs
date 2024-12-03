import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c =a/b; // konwersja niejawna - a zostaje przekonwertowane na double

        //int d = a/b; - nie działa bo w wyniku dostajemy liczbę double a nie int

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        // dla typów obiektowych
        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}

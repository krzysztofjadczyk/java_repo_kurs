package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę w drivers.FirefoxDriver");
    }

    @Override
    public void findElement() {
        System.out.println("Szukam eleentu w klasie drivers.FirefoxDriver");
    }
}

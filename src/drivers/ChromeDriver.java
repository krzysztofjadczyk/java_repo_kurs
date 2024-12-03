package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę w drivers.ChromeDriver");
    }

    @Override
    public void findElement() {
        System.out.println("Szukam eleentu w klasie ChomeDriver");
    }
}

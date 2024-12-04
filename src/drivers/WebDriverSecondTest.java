package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();

        WebDriver safari = new WebDriver() { //klasa anonimowa
            @Override
            public void get() {
                System.out.println("Opening page with safari");
            }

            @Override
            public void findElement() {
                System.out.println("Finding element in safari");
            }
        };

        safari.get();
        safari.findElement();
    }
}

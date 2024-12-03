package drivers;

public class WebDriverTestPolimorfism {

    public static void main(String[] args) {
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElement();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();

        } return null;
    }
}

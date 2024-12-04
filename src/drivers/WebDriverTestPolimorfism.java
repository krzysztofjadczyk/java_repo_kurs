package drivers;

public class WebDriverTestPolimorfism {

    public static void main(String[] args) throws NoValidBrowserName {

        DriverType[] driverTypes = DriverType.values();
        for (int i =0; i<driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }


        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findElement();

    }

   /* private static WebDriver getDriver(DriverType type) throws NoValidBrowserName {
        if (type == DriverType.CHROME) {
            return new ChromeDriver();
        } else if (type == DriverType.FIREFOX) {
            return new FirefoxDriver();

        } throw new NoValidBrowserName("No valid browser name");
    } */

    private static WebDriver getDriver(DriverType type) throws NoValidBrowserName {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        } else if (type.name.equals("firefox")) {
            System.out.println(type.path);
            return new FirefoxDriver();
        }
           throw new NoValidBrowserName("No valid browser name");
    }
}

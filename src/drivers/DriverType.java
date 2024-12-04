package drivers;

public enum DriverType {

    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefox.exe"),
    SAFARI("safari", "/src/reasources/safaridriver/exe");

    String name;
    String path;

    DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }


}

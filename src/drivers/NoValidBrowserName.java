package drivers;

public class NoValidBrowserName extends Exception {  //extends RuntimeException dla wyjątków not checked
    public NoValidBrowserName(String message) {
        super(message);
    }
}

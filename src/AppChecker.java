public class AppChecker {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("Google maps");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Safari");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}

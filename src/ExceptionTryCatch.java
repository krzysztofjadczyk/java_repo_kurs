import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTryCatch {

    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file");
            //readFile("C:\\projekty\\java_repo_kurs\\src\\test.txt");
            readFile("C:\\projekty\\java_repo_kurs\\src\\tesad");

        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}

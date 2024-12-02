public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto("mercedes", "GLK", 2022, 103123);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi", "RS A7", 2020, 0);
        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

    }
}

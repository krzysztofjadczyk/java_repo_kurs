public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka="mercedes";
        mercedes.model="GLK";
        mercedes.rokProdukcji=2022;
        mercedes.przebieg=103123;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "RS A7";
        audi.rokProdukcji = 2020;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();
    }
}

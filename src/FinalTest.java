public class FinalTest {

    public static void main(String[] args) {
        final int x = 2;
        // x = 5; - nie można zmienić wartości

        final Person person = new Person("Tim", 26);
        person.age = 25; // można nadpisać pole

        //person = new Person( "Peter", 87); // nie można przypisać nowej osoby
    }
}

package identifiers.first;

public class Child extends Parent {

    public void testIdentifier() { // klasa potomna w tej samej paczce nie ma dostępu do pola private i metody private
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();
    }
}

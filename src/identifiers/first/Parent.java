package identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default"; // powiązany z paczką
    protected String third = "protected";
    private String fourth = "private";

    public void firstMethod() {
        System.out.println("Metoda public");
    }

    void secondMethod() { // powiązany z paczką
        System.out.println("Metoda default");
    }

    protected void thirdMethod() {
        System.out.println("Metoda protected");
    }

    private void fourthMethod() {
        System.out.println("Metoda private");
    }

    public void testIdentifiers() { // z wnętrza tej samej metody mamy dostęp do wszystkich pól oraz metod
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}

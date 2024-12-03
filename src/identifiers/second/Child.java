package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    public void testIdentifier() { // klasa potomna w innej paczce nie ma dostępu do pól private oraz default i metod private i domyślnych
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}


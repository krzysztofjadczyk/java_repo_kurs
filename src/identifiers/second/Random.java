package identifiers.second;

import identifiers.first.Parent;

public class Random {

    public void testIdentifier(){
        Parent parent = new Parent();

        // klasa w innej paczce ma dosęp tylko do pól/metod public
        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        //parent.fourthMethod();
    }
}

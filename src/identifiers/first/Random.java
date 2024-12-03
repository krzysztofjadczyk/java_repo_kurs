package identifiers.first;

public class Random {

    public void testIdentifier(){
        Parent parent = new Parent();

        // klasa w tej samej paczce nie ma dosępu do pól/metod private
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        //parent.fourthMethod();
    }
}

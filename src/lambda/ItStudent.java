package lambda;

public class ItStudent implements Student {

    @Override
    public boolean sayHello(String name, int age) {
        System.out.println("I am IT guy");
        System.out.println("My name is " + name);
        return true;
    }
}

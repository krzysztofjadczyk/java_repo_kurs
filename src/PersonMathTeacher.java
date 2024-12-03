public class PersonMathTeacher extends Person {

    public String school;

    public PersonMathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze klasy teacher");
        this.school = school;
    }
    public void walk() {
        System.out.println("I walk very fast");
    }
    public void trachMath() {
        System.out.println("I am teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I'm " + age);
    }
}

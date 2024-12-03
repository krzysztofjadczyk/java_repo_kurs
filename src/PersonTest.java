public class PersonTest {

    public static void main(String[] args) {
        PersonMathTeacher teacher = new PersonMathTeacher("Tom", 29, "IV LO");
        teacher.walk();
        teacher.eat();
        teacher.trachMath();
        teacher.sayHello();


        PersonFoolballer footballer = new PersonFoolballer("Mike", 21, "Brzezinki");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}

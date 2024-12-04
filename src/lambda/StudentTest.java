package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student itStudent = new ItStudent();
        sayHello("John", itStudent, 21);

        Student medStudent = new Student() {

            @Override
            public boolean sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
                return true;
            }
        };

        sayHello("Kate", medStudent, 24);

        // wyrażenie lambda
        // (parametr) -> System.out.println("I am not a student, my name is " + name);
        Student noStudent = (name, age) -> {
            System.out.println("I am not a student, my name is " + name + " I'm " + age );
            if (age>18) {
                System.out.println("You can buy an energy drink");
            }
            return false;
        };
        sayHello("Tom", noStudent, 32);
    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);
    }
}

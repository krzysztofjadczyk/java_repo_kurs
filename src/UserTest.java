public class UserTest {

    public static void main(String[] args) {

        // User user = new User();
        User user = new User("Tomek", "dsasf111");

        //user.username = "Krzysztof";
        //user.password = "123qwe";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}

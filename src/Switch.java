import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner wybor = new Scanner(System.in);
        System.out.println("wybierz swoje danie z poniższego menu");
        System.out.println("1 - Pizza");
        System.out.println("2 - Łosoś");
        System.out.println("3 - Frytki");
        int dish = wybor.nextInt();

        switch (dish) {
            case 1:
                System.out.println("Cena za pizzę to 25 zł");
                break;
            case 2:
                System.out.println("Cena za łososia to 35 zł");
                break;
            case 3:
                System.out.println("Cena za frytki to 18 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }
    }
}

public class Tablice {
    public static void main(String[] args) {
        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzień";
        winterMonths[1] = "styczeń";
        winterMonths[2] = "luty";

        int[] numbers = new int[] {1,4,6};

        System.out.println(winterMonths[0]);
        System.out.println(winterMonths[1]);
        System.out.println(winterMonths[2]);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(winterMonths.length);

        winterMonths[2] = "marzec";

        for (int i = 0; i < winterMonths.length; i++) {
            System.out.println(winterMonths[i]);
        }

    }
}

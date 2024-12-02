// Praca domowa
// Wypisz liczby z zakresu 1-100 podzielne przez 3
// odwrócić elementy tablicy [1,3,5] -> [5,3,1]
public class LoopsCheck {
    public static void main(String[] args) {

      /* for (int i = 1; i <= 100; i++) {
          // System.out.println("i= " + i);
            if (i%3 == 0) {
                System.out.println("Jestem liczbą z zakresu 1-100 podzielną przez 3: " + i);
            }
        }*/

       // int[] numery = new int[] {1,3,5};

/*        int[] numbers = new int[] {1,3,5,7,0};
        int[] odwroconeNumery = new int[numbers.length];

       // System.out.println(numbers[0]);
       // System.out.println(odwroconeNumery[0]);
        int dlugoscOdwroconeNumery = odwroconeNumery.length;

        for (int i = 0; i < numbers.length; i++) {
            odwroconeNumery[dlugoscOdwroconeNumery-1] = numbers[i];
            dlugoscOdwroconeNumery--;
        }

        for (int j = 0; j < odwroconeNumery.length; j++) {
            System.out.println(odwroconeNumery[j]);
        } */

// rozwiązane od prowadzącego
        int[] numbers2 = new int[] {1,3,5,7,0,8};

        for (int i=0; i<(numbers2.length/2); i++) {
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length-1-i];
            numbers2[numbers2.length-1-i]=temp;
        }

        for (int i=0; i<numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}

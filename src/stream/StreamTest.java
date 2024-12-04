package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // tworzenie strumienia
        List<String> names = Arrays.asList("Tom","John","Mat","Paul");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[] {1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);

        //przetwarzanie danych
        //filter = filtrowanie danych
        //map - zmiana elementu na coś innego
        //limit - zwraca określoną liczbę elementów
        //peek - pozwala przeprowadzić operację na każdym elemencie

        //zamykanie strumienia
        //forEach - wokanie akcji dla każdego z elementów strumienia
        //count - zwraca ilość elementów w strumieniu
        //allMatch - sprawdza czy elementy spełniają jakiś warunek
        //collect - zwraca nowy typ na podstawie strumienia

        /*streamNames.filter(el -> el.startsWith("T"))
                   .map(el -> el.toUpperCase())
                   .forEach(el -> System.out.println(el)); */

        long count = intStream.filter(el -> el>20)
                .map(el -> el*3)
                //.limit(10)
                .count();
        System.out.println(count);

        List<String> modifiedNames = streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());
    }
}

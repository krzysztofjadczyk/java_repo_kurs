package listy;

import docs.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ola");
        names.add("Paweł");

        System.out.println(names);
        System.out.println(names.get(0));

        System.out.println(names.indexOf("Paweł"));
        System.out.println(names.lastIndexOf("Paweł"));

        System.out.println(names.contains("Paweł"));
        System.out.println(names.contains("Krysia"));

        System.out.println(names.size());

        System.out.println(names.isEmpty());

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);

        System.out.println(numbers);
        System.out.println(numbers.get(0));

        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));

        System.out.println(numbers.contains(3));
        System.out.println(numbers.contains(12));

        System.out.println(numbers.size());

        System.out.println(numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers.isEmpty());

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        for (int i = 0; i<names.size(); i++) {
            System.out.println("Print z pętli for:" + names.get(i));
        }

        for (String name:names) {
            System.out.println("Print z drugiej pętli for: " +name);
        }
    }
}

package docs;

public class PdfDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("I'm pdf document");
    }
}

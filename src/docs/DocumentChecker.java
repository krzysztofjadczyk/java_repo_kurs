package docs;

import javax.print.Doc;

public class DocumentChecker {

    public static void main(String[] args) {
        Document pdfdoc = new PdfDocument();
        Document doc = new ExcelDocument();

        pdfdoc.getDescription();
        doc.getDescription();

    }
}

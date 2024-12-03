package document;

import javax.print.Doc;

public class DocumentChecker {

    public static void main(String[] args) {
        ExcelDocument document = new ExcelDocument();
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        document.getDescription();
        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}

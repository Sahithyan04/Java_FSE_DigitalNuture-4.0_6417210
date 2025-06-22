package Week_1_Design_patterns_and_principles.Handson_2_FactoryMethodPatternExample.code;

//this test if the program is working correct or not
 
public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory WordFac = new WordDocumentFactory();
        Document word = WordFac.createDocument();
        word.open();

        DocumentFactory ExcelFac = new ExcelDocumentFactory();
        Document excel = ExcelFac.createDocument();
        excel.open();

        DocumentFactory PdfFac = new PdfDocumentFactory();
        Document pdf = PdfFac.createDocument();
        pdf.open();


    }
    
}

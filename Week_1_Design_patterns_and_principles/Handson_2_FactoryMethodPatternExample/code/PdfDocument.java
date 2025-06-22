package Week_1_Design_patterns_and_principles.Handson_2_FactoryMethodPatternExample.code;

public class PdfDocument extends Document{

    public PdfDocument() {
    }
    @Override

    public void open() {
        System.out.println("Opening the PDF Document...");
    }
}

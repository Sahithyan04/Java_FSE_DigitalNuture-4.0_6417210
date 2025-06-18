package Week_1.Engineering_concepts.Design_patterns_and_principles.FactoryMethodPatternExample;

public class PdfDocument extends Document{

    public PdfDocument() {
    }
    @Override

    public void open() {
        System.out.println("Opening the PDF Document...");
    }
}

package Week_1_Design_patterns_and_principles.Handson_2_FactoryMethodPatternExample.code;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
    
}

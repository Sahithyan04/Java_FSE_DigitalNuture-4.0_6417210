package Week_1_Design_patterns_and_principles.Handson_2_FactoryMethodPatternExample.code;

public class ExcelDocumentFactory extends DocumentFactory {
    // create excel document factory
    // extends the DocumentFactory 
    @Override
    public Document createDocument() {
        return new ExcelDocument();

    }
    
}

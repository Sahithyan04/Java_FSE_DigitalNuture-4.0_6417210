package Week_1.Engineering_concepts.Design_patterns_and_principles.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {
    // create excel document factory
    // extends the DocumentFactory 
    @Override
    public Document createDocument() {
        return new ExcelDocument();

    }
    
}

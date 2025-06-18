package Week_1.Engineering_concepts.Design_patterns_and_principles.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();

    }
    
}

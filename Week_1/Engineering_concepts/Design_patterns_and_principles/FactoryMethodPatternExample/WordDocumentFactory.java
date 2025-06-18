package Week_1.Engineering_concepts.Design_patterns_and_principles.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
    
    
}

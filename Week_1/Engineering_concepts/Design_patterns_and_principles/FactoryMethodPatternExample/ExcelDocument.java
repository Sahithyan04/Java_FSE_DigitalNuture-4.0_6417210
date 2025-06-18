package Week_1.Engineering_concepts.Design_patterns_and_principles.FactoryMethodPatternExample;

public class ExcelDocument extends Document{

    @Override

    public void open() {
        System.out.println("Opening the Excel Document ...");
    }
    
}

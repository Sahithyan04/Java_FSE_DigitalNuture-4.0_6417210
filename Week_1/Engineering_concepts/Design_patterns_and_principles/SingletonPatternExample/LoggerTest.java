package Week_1.Engineering_concepts.Design_patterns_and_principles.SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is logger 1");
        logger2.log("This is logger 2");
 

        if (logger1 == logger2) {
            System.out.println("Same Instances Confirmed");
        }else {
            System.out.println("Singleton Failed - Might be in multiple instances");
            
        }
    }
}

package Week_1_Design_patterns_and_principles.Handson_1_SingletonPatternExample.code;

// this is for testing this singleton pattern exercise
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

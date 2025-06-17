package Week_1.Engineering_concepts.Design_patterns_and_principles.SingletonPatternExample;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger was Created");
    }
    
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        
        } return instance;
    }

    public void log(String message){
        System.out.println(("[The Log]: " + message));
    }



}


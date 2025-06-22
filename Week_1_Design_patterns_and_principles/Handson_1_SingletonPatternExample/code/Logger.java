package Week_1_Design_patterns_and_principles.Handson_1_SingletonPatternExample.code;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger was Created");
    }
    
    public static Logger getInstance() {
        // only create a new one if nothing is there
        // it states Lazy method
        if (instance == null) {
            instance = new Logger();
        
        } return instance;
    }

    public void log(String message){
        System.out.println(("[The Log]: " + message));
    }



}
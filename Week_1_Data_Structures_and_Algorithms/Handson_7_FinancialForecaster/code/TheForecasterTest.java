package Week_1_Data_Structures_and_Algorithms.Handson_7_FinancialForecaster.code;

public class TheForecasterTest {
    public static void main(String [] args) {

        double presentValue = 1230.9; 
        double growthRate = 0.20; // if we put the 20 percentge of growth 
        int years = 3;


        double futureValue = TheForecaster.calculateFutureValue(presentValue, growthRate, years);
        
        System.out.println("The Future value after " + years + " years: Rs."+ futureValue);

   
    }

    
    
}

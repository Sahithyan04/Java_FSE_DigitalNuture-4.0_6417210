package Week_1.Engineering_concepts.Data_Structures_and_Algorithms.FinancialForecaster;

public class TheForecaster {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years <= 0) {
            return presentValue; // nothing is done if there is no years is there . it is a base case 
        }
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        

    }
    
}

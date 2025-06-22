public class FinancialForecast {

    public static double forecastValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return forecastValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        double presentValue = 1000000; // Example: ₹10,000
        double growthRate = 0.08;    // Example: 8% annual growth
        int years = 5;

        double futureValue = forecastValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years = ₹%.2f\n", years, futureValue);
    }
}

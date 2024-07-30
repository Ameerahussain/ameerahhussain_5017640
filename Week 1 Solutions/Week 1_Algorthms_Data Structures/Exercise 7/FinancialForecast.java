import java.util.HashMap;
import java.util.Map;

public class FinancialForecast {
    private Map<Integer, Double> memo = new HashMap<>();


    public double futureValueRecursive(double PV, double r, int n) {
        if (n == 0) {
            return PV;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        double futureValue = futureValueRecursive(PV, r, n - 1) * (1 + r);
        memo.put(n, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();
        double PV = 1000.0;
        double r = 0.05;
        int n = 10;

        double futureValue = forecast.futureValueRecursive(PV, r, n);
        System.out.println("Future Value after " + n + " years: " + futureValue);
    }
}

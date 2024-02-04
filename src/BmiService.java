public class BmiService {
    public int calculate(double heightMeter, double weightKg) {
        double bmi; // переменная имт
        bmi = weightKg / (heightMeter * heightMeter); // расчет имт
        return (int) bmi;
    }
}

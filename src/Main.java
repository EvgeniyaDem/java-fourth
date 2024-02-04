//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.70;
        double weightKg = 80;
        int bmi = service.calculate(heightMeter, weightKg);
        System.out.println(bmi);

        System.out.println();
        System.out.println("1.70/80");
        System.out.println(service.calculate(1.70, 80));

        System.out.println();
        System.out.println("1.87/66");
        System.out.println(service.calculate(1.87, 66));

        System.out.println();
        System.out.println("1.87/67");
        System.out.println(service.calculate(1.87, 67));

        System.out.println();
        System.out.println("2/70.5");
        System.out.println(service.calculate(2, 70.5));
    }
}

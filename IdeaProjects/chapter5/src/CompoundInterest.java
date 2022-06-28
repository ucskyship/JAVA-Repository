public class CompoundInterest {
    public static void main(String[] args) {

        double p = 1000.0;
        double r = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int n = 1; n <= 10; n++) {
            double amount = p * Math.pow(1.0 + r, n);
            System.out.printf("%4d%,20.2f\n", n, amount);
        }
    }
}

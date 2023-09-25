
import java.util.Scanner;

public class Tester {
    public static double divide(double num, double den) throws Exception {
        if (den == 0) {
            throw new Exception("Denominator is zero");
        }
        return num / den;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            double numerator = scanner.nextDouble();
            System.out.print("Enter the denominator: ");
            double denominator = scanner.nextDouble();

            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}


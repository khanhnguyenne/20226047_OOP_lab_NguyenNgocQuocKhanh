import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter coefficient b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter coefficient c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The solutions are x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The solution is x = " + x);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }
}

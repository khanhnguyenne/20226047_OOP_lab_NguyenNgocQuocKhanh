import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a11: ");
        double a11 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter a12: ");
        double a12 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter b1: ");
        double b1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter a21: ");
        double a21 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter a22: ");
        double a22 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter b2: ");
        double b2 = Double.parseDouble(scanner.nextLine());

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("The solutions are x1 = " + x1 + ", x2 = " + x2);
        }
    }
}

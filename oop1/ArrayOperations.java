import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Double.parseDouble(scanner.nextLine());
        }

        Arrays.sort(array);
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / n;

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

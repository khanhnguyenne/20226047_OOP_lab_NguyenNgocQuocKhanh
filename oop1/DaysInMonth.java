import java.util.Scanner;
import java.time.YearMonth;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter month: ");
            String monthStr = scanner.nextLine().trim();
            int month;

            try {
                month = Integer.parseInt(monthStr);
            } catch (NumberFormatException e) {
                month = Month.valueOf(monthStr.toUpperCase()).getValue();
            }

            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());

            if (month >= 1 && month <= 12 && year >= 0) {
                YearMonth yearMonth = YearMonth.of(year, month);
                int days = yearMonth.lengthOfMonth();
                System.out.println("Number of days: " + days);
                break;
            } else {
                System.out.println("Invalid month/year. Please try again.");
            }
        }
    }
}

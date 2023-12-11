import java.util.Scanner;
// Name: Jeremy Rogers
// Date: 9/15/2023
// Course: COSC-2436

public class SumBetweenIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asking the user for the first and second integer
        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        // Ensure that the second integer is larger than the first
        //prompt the user until it is
        while (second <= first) {
            System.out.println("Second integer must be larger than the first. Please try again.");
            System.out.print("Enter the second integer: ");
            second = scanner.nextInt();
        }
        //print the sum of the integers including the integers entered
        int sum = sumIntegersBetween(first, second);
        System.out.println("Sum of integers between " + first + " and " + second + " (inclusive): " + sum);
    }

    public static int sumIntegersBetween(int low, int high) {
        // continually passing the low value and the value that is one less than the current high value
        //once the first and second value are equal, this recursion stops
        if (low == high) {
            return low;
        } else {
            return high + sumIntegersBetween(low, high - 1);
        }
    }
}

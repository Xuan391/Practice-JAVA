package level3;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int secondSmallest = findSecondSmallest(numbers);
        System.out.println("The second smallest number in the list is: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements.");
        }

        if(allElementsEqual(numbers)){
            throw new IllegalArgumentException("all elements equal");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }

    private static boolean allElementsEqual(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[0]) {
                return false;
            }
        }
        return true;
    }
}

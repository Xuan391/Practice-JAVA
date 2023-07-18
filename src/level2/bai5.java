package level2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("So phan tu: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Danh sach:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int maxSum = findMaximumSubarraySum(array);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int findMaximumSubarraySum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

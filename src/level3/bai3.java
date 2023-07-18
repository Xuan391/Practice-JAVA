package level3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("array number: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int[] longestSubsequence = findLongestIncreasingSubsequence(a);
        System.out.println("Longest increasing subsequence:");
        for (int num : longestSubsequence) {
            System.out.print(num + " ");
        }
    }
    public static int[] findLongestIncreasingSubsequence(int[] array) {
        int n = array.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        int maxLength = 1;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }

        int[] longestSubsequence = new int[maxLength];
        int index = maxLength - 1;
        while (endIndex >= 0) {
            longestSubsequence[index] = array[endIndex];
            endIndex = prev[endIndex];
            index--;
        }

        return longestSubsequence;
    }
}

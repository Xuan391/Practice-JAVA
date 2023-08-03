package level4;

import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequenceNoTwoAdjacentElements {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("so phan tu: ");
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//        System.out.println("array number: ");
//        for(int i=0; i<n; i++){
//            a[i] = sc.nextInt();
//        }
//
//    }

    /// thuật toán chưa đúng
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int longestLength = getLongestIncreasingSubsequence(numbers);
        System.out.println("Longest increasing subsequence length: " + longestLength);
    }
    public static int getLongestIncreasingSubsequence(List<Integer> numbers) {
        int n = numbers.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) <= 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int longestLength = 0;
        for (int length : dp) {
            longestLength = Math.max(longestLength, length);
        }

        return longestLength;
    }
}

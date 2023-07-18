package level4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Gia tri dich: ");
        int sum = sc.nextInt();

        int[] dp = new int[sum + 1];
        dp[0] =1;

        for(int i=0; i<n; i++){
            for(int j = sum; j>= arr[i]; j--){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.printf("So luong day con co tong bang %d la: %d \n", sum, dp[sum]);
    }
//    public static int countDistinctSubsequenceSums(int[] nums, int target) {
//        int n = nums.length;
//        int[][] dp = new int[n + 1][target + 1];
//
//        for (int i = 0; i <= n; i++) {
//            dp[i][0] = 1;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= target; j++) {
//                if (nums[i - 1] <= j) {
//                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//
//        return dp[n][target];
//    }
}

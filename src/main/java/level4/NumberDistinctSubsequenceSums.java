package level4;

import java.util.Scanner;

public class NumberDistinctSubsequenceSums {
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


        System.out.printf("So luong day con co tong bang %d la: %d \n", sum, countDistinctSubsequences(arr,sum));
    }

    // thuật toán này không kiểm tra được trong dãy là những số âm
    public static int countDistinctSubsequences(int[] nums, int target){
        int[] dp = new int[target + 1];
        dp[0] =1;

        for(int i=0; i< nums.length; i++){
            for(int j = target; j>= nums[i]; j--){
                if(nums[i] != target) {
                    dp[j] += dp[j - nums[i]];
                }
            }
        }
        return dp[target];
    }
//    public static int countDistinctSubsequences(int[] nums, int target) {
//        return backtrack(nums, target, 0, 0);
//    }
//
//    public static int backtrack(int[] nums, int target, int index, int currentSum) {
//        if (currentSum == target) {
//            return 1;
//        }
//
//        if (index == nums.length) {
//            return 0;
//        }
//
//        int count = 0;
//        for (int i = index; i < nums.length; i++) {
//            if (currentSum + nums[i] <= target) {
//                count += backtrack(nums, target, i + 1, currentSum + nums[i]);
//            }
//        }
//
//        return count;
//    }
}

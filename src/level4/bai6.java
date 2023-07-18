package level4;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the maximum product of any three distinct elements in the list: " + getMaxProduct(arr));

    }

        public static int getMaxProduct(int[] numbers) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int num : numbers) {
                if (num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max3 = max2;
                    max2 = num;
                } else if (num > max3) {
                    max3 = num;
                }

                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }

            return Math.max(max1 * max2 * max3, max1 * min1 * min2);
        }

}

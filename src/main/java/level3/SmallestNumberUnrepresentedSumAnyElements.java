package level3;

import java.util.Scanner;

public class SmallestNumberUnrepresentedSumAnyElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("array number: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int smallestUnrepresentedInteger = findSmallestUnrepresentedInteger(a);
        System.out.println("Smallest unrepresented integer: " + smallestUnrepresentedInteger);
    }

    public static int findSmallestUnrepresentedInteger(int[] arr) {
        int smallest = 1; // Initialize the smallest positive integer

        for (int num : arr) {
            if (num > smallest) {
                break;
            }
            smallest += num;
        }

        return smallest;
    }
}

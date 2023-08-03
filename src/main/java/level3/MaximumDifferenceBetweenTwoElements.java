package level3;

import java.util.Scanner;

public class MaximumDifferenceBetweenTwoElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("array number: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("hieu lon nhat: " + findMaximumDifferenceBetweenTwoElements(a));
    }

    public static int findMaximumDifferenceBetweenTwoElements(int[] arr){
        if(arr.length<2){
            throw new IllegalArgumentException("Array must contain least 2 elements");
        }

        int max = arr[0];
        int min = arr[0];
        for(int num : arr){
            if(max < num) max = num;
            if(min > num) min = num;
        }
        return max - min;
    }
}

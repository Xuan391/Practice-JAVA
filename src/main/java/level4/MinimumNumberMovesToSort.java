package level4;

import java.util.Scanner;

public class MinimumNumberMovesToSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = minimumNumberMovesToSort(arr);
        System.out.println();
        System.out.println("So lan lap: "+count);
    }

    public static int minimumNumberMovesToSort(int[] arr){
        int count = 0;
        for (int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                    count ++;
                }
            }
        }
        return count;
    }
}

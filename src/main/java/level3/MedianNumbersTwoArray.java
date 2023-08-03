package level3;

import java.util.Scanner;

public class MedianNumbersTwoArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu mang a: ");
        int n = sc.nextInt();

        System.out.print("so phan tu mang b: ");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        System.out.println("array number a: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("array number b: ");
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
    }

    public static float medianNumbersTwoArray(int[] arr1, int[] arr2){
        int[] mergeArray = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,mergeArray,0, arr1.length);
        System.arraycopy(arr2,0,mergeArray,arr1.length,arr2.length);

        for(int i=0; i< (arr1.length+arr2.length); i++){
            for (int j=i+1; j<(arr1.length+arr2.length); j++){
                if(mergeArray[i]>mergeArray[j]){
                    int temp;
                    temp = mergeArray[i];
                    mergeArray[i] =mergeArray[j];
                    mergeArray[j] = temp;
                }
            }
        }

        if((arr1.length+arr2.length) % 2 ==1){
            return mergeArray[(arr1.length+arr2.length)/2];
        } else {
            return  ((float)mergeArray[(arr1.length+arr2.length)/2-1] + (float)mergeArray[(arr1.length+arr2.length)/2])/2;
        }
    }
}

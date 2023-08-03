package level2;

import java.util.Scanner;

public class SumNumberDivisibleBoth3And5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println(" nhap danh sach: ");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(sumNumberDivisibleBoth3And5(a));

    }

    public static int sumNumberDivisibleBoth3And5(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 15 ==0){
                sum += arr[i];
            }
        }
        return sum;
    }
}

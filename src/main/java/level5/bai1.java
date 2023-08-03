package level5;

import java.util.Scanner;

public class bai1 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("so phan tu: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

           reversesArray(arr);
            System.out.println("reversed Array: ");
            for(int a: arr){
                System.out.println(a);
            }
        }

        public static void reversesArray(int[] src){
            for (int i = 0, j = src.length - 1; i < j; i++, j--){
                int temp = src[i];
                src[i]  = src[j];
                src[j] = temp;
            }
        }
}

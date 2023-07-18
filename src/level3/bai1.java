package level3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("array number: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("phan tu nho thu 2 trong danh sach: " + a[1]);
    }
}

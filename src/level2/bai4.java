package level2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println(" nhap danh sach: ");
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0; i<n; i++){
            if(a[i] % 15 == 0){
                sum += a[i];
            }
        }
        System.out.println(sum);

    }
}

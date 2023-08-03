package level1;

import java.util.Scanner;

public class MedianNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("so phan tử:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("nhap danh sach so:");
        for(int i=0; i<n; i++){
            a[i] =sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    int temp;
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        if (n%2 == 1){
            System.out.println("so chung vi la: "+ a[a.length /2]);
        } else {
            System.out.println("so chung vi la: "+ (  ( (float)a[a.length /2-1]+ (float)a[a.length/2])/2));
        }

    }
}

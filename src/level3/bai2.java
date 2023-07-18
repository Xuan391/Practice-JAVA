package level3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("array number: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int max=a[0];
        int min=a[0];
        for (int i=0; i<n; i++){
            if(max <a[i]) max =a[i];
        }
        for (int i=0; i<n; i++){
            if(min >a[i]) min =a[i];
        }
        System.out.println("hieu lon nhat: " + (max- min));
    }
}

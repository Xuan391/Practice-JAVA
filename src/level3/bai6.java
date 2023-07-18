package level3;

import java.util.Scanner;

public class bai6 {
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

        int[] mergeArray = new int[n+m];
        System.arraycopy(a,0,mergeArray,0, n);
        System.arraycopy(b,0,mergeArray,n,m);

        for(int i=0; i< (n+m); i++){
            for (int j=i+1; j<(m+n); j++){
                if(mergeArray[i]>mergeArray[j]){
                    int temp;
                    temp = mergeArray[i];
                    mergeArray[i] =mergeArray[j];
                    mergeArray[j] = temp;
                }
            }
        }

        if((m+n) % 2 ==1){
            System.out.println("So trung vi cua hai day: " + mergeArray[(m+n)/2]);
        } else {
            System.out.println("So trung vi cua hai day: "+ ((float)mergeArray[(m+n)/2-1] + (float)mergeArray[(m+n)/2])/2);
        }


    }
}

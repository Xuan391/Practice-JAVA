package level2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];

        for (int i=0; i<n; i++){
            a[i] = sc.next();
        }
        int max = a[0].length();
        int index = 0;
        for (int i=0; i<n; i++){
            if(max < a[i].length()){
                max = a[i].length();
                index = i;
            }
        }
        System.out.println(a[index]);
    }

}

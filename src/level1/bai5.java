package level1;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];

        for (int i=0; i<n; i++){
            a[i] = sc.next();
        }
        int min = a[0].length();
        int index = 0;
        for (int i=0; i<n; i++){
            if(min > a[i].length()){
                min = a[i].length();
                index = i;
            }
        }
        System.out.println(a[index]);
    }
}

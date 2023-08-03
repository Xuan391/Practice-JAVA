package level1;

import java.util.Scanner;

public class NumberStringContainA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i=0; i<n; i++){
            strArr[i] = sc.nextLine();
        }
        int count = countStringContainA(strArr);
        System.out.println("so chuoi chua tu a la: "+ count );

    }

    public static int countStringContainA(String[] strArray){
        int count = 0;
        for (String str : strArray){
            if(containA(str)) count ++;
        }
        return count;
    }
    public static boolean containA(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a'){
                return true;
            }
        }
        return false;
    }
}

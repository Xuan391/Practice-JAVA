package level1;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        System.out.println(s.length());
        if(s.charAt(0) != ' ') count =1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}

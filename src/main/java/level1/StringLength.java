package level1;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();//next() chuỗi không chứa khoảng trắng
        String s = sc.nextLine();
        System.out.println(s.length());
    }
}

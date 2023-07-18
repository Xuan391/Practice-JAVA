package level2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String longestCommonSubstring = longestCommonSubString(str1, str2);
        System.out.println(longestCommonSubstring);

    }

    public static String longestCommonSubString(String str1, String str2){
        int [][] dp = new int[str1.length() + 1][str2.length()+1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i< str1.length(); i++){
            for (int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                    if (dp[i+1][j+1] > maxLength){
                        maxLength = dp[i+1][j+1];
                        endIndex = i+1;
                    }
                } else {
                    dp[i+1][j+1] = 0;
                }
            }
        }
        return str1.substring(endIndex-maxLength, endIndex);
    }
}

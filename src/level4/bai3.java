package level4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu: ");
        int n = sc.nextInt();

        String[] strings = new String[n];
        System.out.println("Strings Array: ");
        for(int i=0; i<n; i++){
            strings[i] = sc.next();
        }

        int count = longestCommonSubstring(strings);
        System.out.println("Longest common substring: "+ count);

    }
    public static int longestCommonSubstring(String[] strings) {
        if (strings == null || strings.length == 0) {
            return 0;
        }

        String firstString = strings[0];
        int longestSubstring = 0;

        for (int i = 0; i < firstString.length(); i++) {
            for (int j = i + 1; j <= firstString.length(); j++) {
                String substring = firstString.substring(i, j);
                boolean commonSubstring = true;

                for (int k = 1; k < strings.length; k++) {
                    if (!strings[k].contains(substring)) {
                        commonSubstring = false;
                        break;
                    }
                }

                if (commonSubstring && substring.length() > longestSubstring) {
                    longestSubstring = substring.length();
                }
            }
        }

        return longestSubstring;
    }
}
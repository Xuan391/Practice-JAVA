package level4;

import java.util.Scanner;

public class SortStringByLengthAndDesc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu: ");
        int n = sc.nextInt();

        String[] strings = new String[n];
        System.out.println("Strings Array: ");
        for( int i=0; i<n; i++){
            strings[i] = sc.nextLine();
        }
        System.out.println("Sorted Array: ");
        String[] strings1 = sortedStrings(strings);
        for(String str : strings1){
            System.out.println(str);
        }

    }

    public static String[] sortedStrings(String[] strings){
        for (int i = 0; i < strings.length ; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (countDistinctCharacters(strings[i]) < countDistinctCharacters(strings[j])) {
                    String temp;
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if (strings[i].compareTo(strings[j]) > 0 && (countDistinctCharacters(strings[i]) == countDistinctCharacters(strings[j]) )) {
                    // Hoán đổi vị trí
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }

    public static int countDistinctCharacters(String str) {
//        boolean[] visited = new boolean[128];
//        int count = 0;
//
//        for (char c : str.toCharArray()) {
//            if (!visited[c]) {
//                visited[c] = true;
//                count++;
//            }
//        }
//        return count;
        return str.length();
    }
}

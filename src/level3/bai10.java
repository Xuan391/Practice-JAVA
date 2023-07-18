package level3;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu: ");
        int n = sc.nextInt();
        String[] strArr = new String[n];
        System.out.println("Nhap chuoi: ");
        for(int i=0; i<n; i++){
            strArr[i] = sc.next();
        }

        sortStringsByDistinctCharacters(strArr);
        System.out.println("Sortes Strings: ");
        for(String str : strArr){
            System.out.println(str);
        }

    }
    public static void sortStringsByDistinctCharacters(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (countDistinctCharacters(strings[j]) > countDistinctCharacters(strings[j + 1])) {
                    swap(strings, j, j + 1);
                }
            }
        }
    }

    public static int countDistinctCharacters(String str) {
        boolean[] visited = new boolean[128];
        int count = 0;

        for (char c : str.toCharArray()) {
            if (!visited[c]) {
                visited[c] = true;
                count++;
            }
        }

        return count;
    }

    public static void swap(String[] strings, int i, int j) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
    }
}

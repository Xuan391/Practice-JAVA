package level1;

import java.util.Scanner;

public class StringArrayAsc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Số phần tử: ");
        int n = sc.nextInt();

        String[] stringArray = new String[n];

        System.out.println("strings:");
        for (int i = 0; i < n; i++) {
            stringArray[i] = sc.next();
        }

        // Sắp xếp danh sách theo thứ tự bảng chữ cái (Bubble Sort)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (stringArray[i].compareTo(stringArray[j]) > 0) {
                    // Hoán đổi vị trí
                    String temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

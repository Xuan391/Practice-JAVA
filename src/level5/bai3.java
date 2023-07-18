package level5;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5,6 ,2 ,3 ,6};
        int[] result = removeDuplicates(arr);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int uniqueCount = 0;

        // Tạo một mảng mới với kích thước tối đa
        int[] result = new int[n];

        // Duyệt qua mảng và kiểm tra phần tử tại vị trí hiện tại
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Kiểm tra nếu phần tử đã xuất hiện trước đó
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Nếu không phải là phần tử bị lặp, thêm vào mảng kết quả
            if (!isDuplicate) {
                result[uniqueCount++] = arr[i];
            }
        }

        // Tạo mảng mới với kích thước uniqueCount
        int[] finalResult = new int[uniqueCount];

        // Sao chép các phần tử không bị lặp vào mảng kết quả cuối cùng
        System.arraycopy(result, 0, finalResult, 0, uniqueCount);

        return finalResult;
    }
}

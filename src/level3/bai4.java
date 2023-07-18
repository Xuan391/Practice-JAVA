package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.print("Enter the number of strings: ");
        int numStrings = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the strings:");
        for (int i = 0; i < numStrings; i++) {
            String input = sc.nextLine();
            strings.add(input);
        }

        String[] largestOverlapStrings = findLargestOverlapStrings(strings);
        System.out.println("Strings with the largest overlap:");
        for (String str : largestOverlapStrings) {
            System.out.println(str);
        }
    }

    public static String[] findLargestOverlapStrings(List<String> strings) {
        String[] largestOverlapStrings = new String[2];
        int maxOverlap = 0;

        for (int i = 0; i < strings.size() - 1; i++) {
            String str1 = strings.get(i);
            for (int j = i + 1; j < strings.size(); j++) {
                String str2 = strings.get(j);
                int overlap = calculateOverlap(str1, str2);
                if (overlap > maxOverlap) {
                    maxOverlap = overlap;
                    largestOverlapStrings[0] = str1;
                    largestOverlapStrings[1] = str2;
                }
            }
        }

        return largestOverlapStrings;
    }

    public static int calculateOverlap(String str1, String str2) {
        int maxOverlap = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                int k = 0;
                while (i + k < str1.length() && j + k < str2.length() && str1.charAt(i + k) == str2.charAt(j + k)) {
                    k++;
                }
                maxOverlap = Math.max(maxOverlap, k);
            }
        }

        return maxOverlap;
    }
}
/*
*Nhập danh sách chuỗi:

Sử dụng đối tượng Scanner để nhập số lượng chuỗi từ người dùng.
Sử dụng một ArrayList để lưu trữ danh sách các chuỗi được nhập.
Tìm hai chuỗi có sự trùng lắp lớn nhất:

Đối với mỗi cặp chuỗi trong danh sách:
Gọi chuỗi thứ nhất là str1, chuỗi thứ hai là str2.
Gọi hàm calculateOverlap(str1, str2) để tính toán sự trùng lắp giữa hai chuỗi.
So sánh giá trị trùng lắp với giá trị trùng lắp lớn nhất hiện tại.
Nếu giá trị trùng lắp lớn hơn giá trị trùng lắp lớn nhất hiện tại, cập nhật giá trị trùng lắp lớn nhất và lưu trữ hai chuỗi tương ứng vào mảng largestOverlapStrings.
Hàm calculateOverlap(str1, str2):

Đầu vào của hàm là hai chuỗi str1 và str2.
Khởi tạo biến maxOverlap bằng 0 để lưu trữ sự trùng lắp lớn nhất.
Dùng hai vòng lặp lồng nhau để so sánh từng cặp ký tự ở các vị trí tương ứng trong hai chuỗi.
Dùng một vòng lặp while để kiểm tra các ký tự tiếp theo trong hai chuỗi và tăng giá trị của biến k cho đến khi không có sự trùng lắp nữa.
So sánh và cập nhật giá trị maxOverlap nếu giá trị k lớn hơn giá trị maxOverlap hiện tại.
In ra hai chuỗi có sự trùng lắp lớn nhất:

Truy cập mảng largestOverlapStrings để lấy hai chuỗi có sự trùng lắp lớn nhất.
In ra hai chuỗi đó là kết quả.
*/

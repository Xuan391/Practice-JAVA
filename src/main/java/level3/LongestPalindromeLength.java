package level3;

import java.util.Scanner;

public class LongestPalindromeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int longestPalindromeLength = findLongestPalindromeLength(input);
        System.out.println("Length of the longest palindrome: " + longestPalindromeLength);
    }

    public static int findLongestPalindromeLength(String str) {
        int[] charCount = new int[128];
        int oddCount = 0;

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            return str.length();
        } else {
            return str.length() - oddCount + 1;
        }
    }
}
/*
* Nhập chuỗi:

Sử dụng đối tượng Scanner để nhập một chuỗi từ người dùng.
Tìm độ dài của chuỗi palindrome dài nhất:

Đầu tiên, chúng ta sử dụng một mảng charCount có kích thước 128 để lưu trữ số lần xuất hiện của mỗi ký tự trong dãy ký tự ASCII.
Chúng ta lặp qua các ký tự trong chuỗi và tăng giá trị tương ứng trong mảng charCount.
Tiếp theo, chúng ta lặp qua mảng charCount và kiểm tra xem có bất kỳ giá trị nào lẻ hay không. Nếu giá trị là lẻ, chúng ta tăng biến oddCount lên 1.
Trả về độ dài của chuỗi palindrome dài nhất:

Chúng ta so sánh giá trị oddCount với 1. Nếu oddCount nhỏ hơn hoặc bằng 1, điều đó có nghĩa là chuỗi có thể tạo thành một palindrome. Trong trường hợp này, chúng ta trả về độ dài của chuỗi ban đầu.
Nếu oddCount lớn hơn 1, chúng ta trả về độ dài của chuỗi trừ đi oddCount cộng với 1. Điều này là do chúng ta chỉ có thể có tối đa một ký tự với tần suất lẻ trong chuỗi palindrome dài nhất.
* */
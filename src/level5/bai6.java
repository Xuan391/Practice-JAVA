package level5;

public class bai6 {
    public static void main(String[] args){
    String[] strings = {"hello   world", "Nguyen    Thanh Xuan"};
    for (String str: strings){
        str = removeExtraSpaces(str);
        System.out.println(str);
    }
    }

    public static String removeExtraSpaces(String input) {
        // Loại bỏ khoảng trắng đầu và cuối chuỗi
        String trimmed = input.trim();

        // Thay thế các khoảng trắng liên tiếp bằng một khoảng trắng duy nhất
        String result = trimmed.replaceAll("\\s+", " ");

        return result;
    }
}

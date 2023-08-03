package level4;

public class LongestCommonSubstringWithMinLengthTarget {
    public static void main(String[] args) {
        String[] strings = {"abcdefg", "abcde", "abcdef", "ab", "abc"};
        int k = 6;
        String[] result = getLargestOverlap(strings, k);
        System.out.println("Strings with largest overlap: " + result[0] + " and " + result[1]);
    }

    public static String[] getLargestOverlap(String[] strings, int k) {
        int maxOverlap = 0;
        String string1 = "";
        String string2 = "";

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String[] substrings = getSubstrings(strings[i], k);
                for (String substring : substrings) {
                    if (containsSubstring(strings[j], substring)) {
                        int overlap = strings[j].length() - strings[j].indexOf(substring);
                        if (overlap > maxOverlap) {
                            maxOverlap = overlap;
                            string1 = strings[i];
                            string2 = strings[j];
                        }
                    }
                }
            }
        }

        return new String[]{string1, string2};
    }

    public static String[] getSubstrings(String str, int k) {
        int numSubstrings = str.length() - k + 1;
        String[] substrings = new String[numSubstrings];
        for (int i = 0; i < numSubstrings; i++) {
            substrings[i] = str.substring(i, i + k);
        }
        return substrings;
    }

    public static boolean containsSubstring(String str, String substring) {
        int substringLength = substring.length();
        int endIndex = str.length() - substringLength;
        for (int i = 0; i <= endIndex; i++) {
            if (str.regionMatches(i, substring, 0, substringLength)) {
                return true;
            }
        }
        return false;
    }
}
